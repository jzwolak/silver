grammar silver:modification:copper;

terminal Dominates_t 'dominates' lexer classes {KEYWORD};
terminal Submits_t   'submits'   lexer classes {KEYWORD};
terminal Classes_kwd 'classes'   lexer classes {KEYWORD};

concrete production terminalModifierDominates
top::TerminalModifier ::= 'dominates' '{' terms::TermPrecList '}'
{
  top.pp = "dominates { " ++ terms.pp ++ " } ";

  top.terminalModifiers = [termDominates(terms.precTermList)];
  top.errors := terms.errors;
}

concrete production terminalModifierSubmitsTo
top::TerminalModifier ::= 'submits' 'to' '{' terms::TermPrecList  '}'
{
  top.pp = "submits to { " ++ terms.pp ++ " } " ;

  top.terminalModifiers = [termSubmits(terms.precTermList)];
  top.errors := terms.errors;
}

concrete production terminalModifierClassSpec
top::TerminalModifier ::= 'lexer' 'classes' '{' cl::ClassList '}'
{
  top.pp = "lexer classes { " ++ cl.pp ++ " } " ;

  top.terminalModifiers = [termClasses(cl.lexerClasses)];
  top.lexerClasses = cl.lexerClasses;
  top.errors := cl.errors;
}

concrete production terminalModifierActionCode
top::TerminalModifier ::= 'action' acode::ActionCode_c
{
  top.pp = "action " ++ acode.pp;

  top.terminalModifiers = [termAction(acode.actionCode)];

  acode.frame = actionContext();
  acode.env = newScopeEnv(addTerminalAttrDefs(acode.defs), top.env);
  
  top.errors := acode.errors;
}

aspect default production
top::TerminalModifier ::=
{
  top.lexerClasses = [];
}

nonterminal TermPrecList with config, grammarName, pp, location, precTermList, errors, env;

synthesized attribute precTermList :: [String];

-- The rest of this file is written quite sillily. It'll be automatically fixed when we get a proper ast/cst split

concrete production termPrecListOne
terms::TermPrecList ::= t::QName
{
   forwards to termPrecList(t,termPrecListNull(location=t.location), location=t.location);
}

concrete production termPrecListCons
terms::TermPrecList ::= t::QName ',' terms_tail::TermPrecList
{
   forwards to termPrecList(t,terms_tail,location=terms.location);
}


abstract production termPrecList
top::TermPrecList ::= h::QName t::TermPrecList
{
  top.pp = if t.pp == ""
             then h.pp
             else h.pp ++ ", " ++ t.pp;

  production fName::String = if null(h.lookupType.dcls) then h.lookupLexerClass.dcl.fullName else h.lookupType.dcl.fullName;

  top.precTermList = [fName] ++ t.precTermList ;

  top.errors := t.errors;
  
  -- Since we're looking it up in two ways, do the errors ourselves
  top.errors <- if null(h.lookupType.dcls) && null(h.lookupLexerClass.dcls)
                then [err(h.location, "Undeclared terminal or lexer class '" ++ h.name ++ "'.")]
                else if length(h.lookupType.dcls ++ h.lookupLexerClass.dcls) > 1
                then [err(h.location, "Ambiguous reference to terminal or lexer class '" ++ h.name ++ "'. Possibilities are:\n" ++ printPossibilities(h.lookupType.dcls ++ h.lookupLexerClass.dcls))]
                else [];
}

abstract production termPrecListNull
top::TermPrecList ::=
{
  top.precTermList = [];
  top.pp = "";
  top.errors := [];
}


-- TODO this should probably be a global or something now...
function addTerminalAttrDefs
[Def] ::= moredefs::[Def]
{
  -- TODO: no grammar or location? how to deal with this?
  return [termAttrValueDef("DBGtav", bogusLocation(), "lexeme", stringType()),
          termAttrValueDef("DBGtav", bogusLocation(), "filename", stringType()),
          termAttrValueDef("DBGtav", bogusLocation(), "line", intType()),
          termAttrValueDef("DBGtav", bogusLocation(), "column", intType())] ++
           moredefs;
}


nonterminal ClassList with location, config, pp, lexerClasses, errors, env;

synthesized attribute lexerClasses :: [String] occurs on TerminalModifier, TerminalModifiers;

concrete production lexerClassesOne
top::ClassList ::= n::QName
{
  forwards to lexerClassesMain(n,lexerClassesNull(location=n.location), location=n.location);
}

concrete production lexerClassesCons
top::ClassList ::= n::QName ',' cl_tail::ClassList
{
  forwards to lexerClassesMain(n,cl_tail,location=top.location);
}


abstract production lexerClassesMain
top::ClassList ::= n::QName t::ClassList
{
  top.pp = if t.pp == ""
          then n.pp
          else n.pp ++ ", " ++ t.pp;

  top.errors := n.lookupLexerClass.errors ++ t.errors;

  top.lexerClasses = [n.lookupLexerClass.dcl.fullName] ++ t.lexerClasses;
}

abstract production lexerClassesNull
cl::ClassList ::=
{
  cl.pp = "";
  cl.errors := [];
  cl.lexerClasses = [];
}

aspect production terminalModifiersNone
top::TerminalModifiers ::=
{
  top.lexerClasses = [];
}

aspect production terminalModifierSingle
top::TerminalModifiers ::= tm::TerminalModifier
{
  top.lexerClasses = tm.lexerClasses;
}

aspect production terminalModifiersCons
top::TerminalModifiers ::= h::TerminalModifier ',' t::TerminalModifiers
{
  top.lexerClasses = h.lexerClasses ++ t.lexerClasses;
}

function quote
String ::= s::String
{
  return "\"" ++ s ++ "\"";
}

