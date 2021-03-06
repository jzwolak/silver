grammar silver:definition:concrete_syntax:ast;

synthesized attribute dominatesXML :: String;
synthesized attribute submitsXML :: String;
synthesized attribute lexerclassesXML :: String;
synthesized attribute ignored :: Boolean;
synthesized attribute marking :: Boolean;
synthesized attribute acode :: String;
synthesized attribute opPrecedence :: Maybe<Integer>;
synthesized attribute opAssociation :: Maybe<String>; -- TODO type?
synthesized attribute prettyName :: Maybe<String>;
autocopy attribute terminalName :: String;

{--
 - Modifiers for terminals.
 -}
nonterminal SyntaxTerminalModifiers with cstEnv, cstErrors, dominatesXML,
  submitsXML, ignored, acode, lexerclassesXML, opPrecedence, opAssociation,
  unparses, marking, terminalName, prettyName;

abstract production consTerminalMod
top::SyntaxTerminalModifiers ::= h::SyntaxTerminalModifier  t::SyntaxTerminalModifiers
{
  top.cstErrors := h.cstErrors ++ t.cstErrors;
  top.dominatesXML = h.dominatesXML ++ t.dominatesXML;
  top.submitsXML = h.submitsXML ++ t.submitsXML;
  top.lexerclassesXML = h.lexerclassesXML ++ t.lexerclassesXML;
  top.ignored = h.ignored || t.ignored;
  top.marking = h.marking || t.marking;
  top.acode = h.acode ++ t.acode;
  top.opPrecedence = orElse(h.opPrecedence, t.opPrecedence);
  top.opAssociation = orElse(h.opAssociation, t.opAssociation);
  top.unparses = h.unparses ++ t.unparses;
  top.prettyName = orElse(h.prettyName, t.prettyName);
}

abstract production nilTerminalMod
top::SyntaxTerminalModifiers ::= 
{
  top.cstErrors := [];
  top.dominatesXML = "";
  top.submitsXML = "";
  top.lexerclassesXML = "";
  top.ignored = false;
  top.marking = false;
  top.acode = "";
  top.opPrecedence = nothing();
  top.opAssociation = nothing();
  top.unparses = [];
  top.prettyName = nothing();
}



{--
 - Modifiers for terminals.
 -}
nonterminal SyntaxTerminalModifier with cstEnv, cstErrors, dominatesXML,
  submitsXML, ignored, acode, lexerclassesXML, opPrecedence, opAssociation,
  unparses, marking, terminalName, prettyName;

{- We default ALL attributes, so we can focus only on those that are interesting in each case... -}
aspect default production
top::SyntaxTerminalModifier ::=
{
  top.cstErrors := [];
  top.dominatesXML = "";
  top.submitsXML = "";
  top.lexerclassesXML = "";
  top.ignored = false;
  top.marking = false;
  top.acode = "";
  top.opPrecedence = nothing();
  top.opAssociation = nothing();
  --top.unparses -- don't default unparses
  top.prettyName = nothing();
}

{--
 - If present, it's an ignore terminal, otherwise ordinary terminal.
 - Copper has no notion of an ignore terminal, this is translated away.
 -}
abstract production termIgnore
top::SyntaxTerminalModifier ::=
{
  top.ignored = true;
  top.unparses = ["ignore()"];
}
{--
 - If present, this is a Marking terminal. In the default translation,
 - this does nothing.
 -}
abstract production termMarking
top::SyntaxTerminalModifier ::=
{
  top.marking = true;
  top.unparses = ["marking()"];
}
{--
 - The terminal's precedence. (Resolves shift/reduce conflicts)
 -}
abstract production termPrecedence
top::SyntaxTerminalModifier ::= lvl::Integer
{
  top.opPrecedence = just(lvl);
  top.unparses = ["prec(" ++ toString(lvl) ++ ")"];
}
{--
 - The terminal's association. Either left, right, or nonassoc. TODO: a type?
 -}
abstract production termAssociation
top::SyntaxTerminalModifier ::= direction::String
{
  top.opAssociation = just(direction);
  top.unparses = ["assoc(" ++ quoteString(direction) ++ ")"];
}
{--
 - The terminal's "pretty name". Used for error messages.
 -}
abstract production termPrettyName
top::SyntaxTerminalModifier ::= prettyName::String
{
  top.prettyName = just(prettyName);
  top.unparses = ["named(" ++ quoteString(prettyName) ++ ")"];
}
{--
 - The terminal's lexer classes.
 -}
abstract production termClasses
top::SyntaxTerminalModifier ::= cls::[String]
{
  local clsRefsL :: [[Decorated SyntaxDcl]] = lookupStrings(cls, top.cstEnv);
  production clsRefs :: [Decorated SyntaxDcl] = map(head, clsRefsL);

  top.cstErrors := flatMap(\ a::Pair<String [Decorated SyntaxDcl]> ->
                     if !null(a.snd) then []
                     else ["Lexer Class " ++ a.fst ++ " was referenced but " ++
                           "this grammar was not included in this parser. (Referenced from lexer class on terminal " ++ top.terminalName ++")"], 
                   zipWith(pair, cls, clsRefsL)); 
  -- We "translate away" lexer classes dom/sub, by moving that info to the terminals (here)
  top.dominatesXML = implode("", map((.classDomContribs), clsRefs));
  top.submitsXML = implode("", map((.classSubContribs), clsRefs));
  top.lexerclassesXML = implode("", map(xmlCopperRef, clsRefs));
  top.unparses = ["classes(" ++ unparseStrings(cls) ++ ")"];
}
{--
 - The submits list for the terminal. Either lexer classes or terminals.
 -}
abstract production termSubmits
top::SyntaxTerminalModifier ::= sub::[String]
{
  production subRefs :: [[Decorated SyntaxDcl]] = lookupStrings(sub, top.cstEnv);

  top.cstErrors := flatMap(\ a::Pair<String [Decorated SyntaxDcl]> ->
                     if !null(a.snd) then []
                     else ["Terminal / Lexer Class " ++ a.fst ++ " was referenced but " ++
                           "this grammar was not included in this parser. (Referenced from submit clause on terminal " ++ top.terminalName ++")"], 
                   zipWith(pair, sub, subRefs)); 
  top.submitsXML = implode("", map(xmlCopperRef, map(head, subRefs)));
  top.unparses = ["sub(" ++ unparseStrings(sub) ++ ")"];
}
{--
 - The dominates list for the terminal. Either lexer classes or terminals.
 -}
abstract production termDominates
top::SyntaxTerminalModifier ::= dom::[String]
{
  production domRefs :: [[Decorated SyntaxDcl]] = lookupStrings(dom, top.cstEnv);

  top.cstErrors := flatMap(\ a::Pair<String [Decorated SyntaxDcl]> ->
                     if !null(a.snd) then []
                     else ["Terminal / Lexer Class " ++ a.fst ++ " was referenced but " ++
                           "this grammar was not included in this parser. (Referenced from dominates clause on terminal " ++ top.terminalName ++")"],
                   zipWith(pair, dom, domRefs)); 
  top.dominatesXML = implode("", map(xmlCopperRef, map(head, domRefs)));
  top.unparses = ["dom(" ++ unparseStrings(dom) ++ ")"];
}
{--
 - The action to take whenever this terminal is SHIFTed.
 -}
abstract production termAction
top::SyntaxTerminalModifier ::= acode::String
{
  top.acode = acode;
  top.unparses = ["acode(\"" ++ escapeString(acode) ++ "\")"];
}

