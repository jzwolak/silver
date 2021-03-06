grammar silver:extension:patternmatching;

import silver:extension:list only LSqr_t, RSqr_t;

{--
 - The forms of syntactic patterns that are permissible in (nested) case expresssions.
 -}
nonterminal Pattern with location, config, pp, env, errors, patternIsVariable, patternVariableName, patternSubPatternList, patternSortKey;

{--
 - False if it actually matches anything specific, true if it's a variable/wildcard.
 -}
synthesized attribute patternIsVariable :: Boolean;
{--
 - The name of the variable, if any (e.g. wildcards!)
 -}
synthesized attribute patternVariableName :: Maybe<String>;
{--
 - Each child pattern below this one.
 -}
synthesized attribute patternSubPatternList :: [Decorated Pattern];
{--
 - The sort (and grouping) key of the pattern.
 - "~var" if patternIsVariable is true. (TODO: actually, we should call it undefined! It's not used.)
 - fullname if it's a production.
 - otherwise, it is type-depedent, but same values should be the same!
 -}
synthesized attribute patternSortKey :: String;


-- These are the "canonical" patterns:

{--
 - Match on a production, extracting children as patterns, too.
 - The production name may be qualified.
 - TODO: if not qualified filter down to productions on scruntinee type
 -}
concrete production prodAppPattern
top::Pattern ::= prod::QName '(' ps::PatternList ')'
{
  top.pp = prod.pp ++ "(" ++ ps.pp ++ ")";
  top.errors := ps.errors;

  local parms :: Integer = length(prod.lookupValue.typerep.inputTypes);

  top.errors <-
    if null(prod.lookupValue.dcls) || length(ps.patternList) == parms then []
    else [err(prod.location, prod.pp ++ " has " ++ toString(parms) ++ " parameters but " ++ toString(length(ps.patternList)) ++ " patterns were provided")];

  top.patternIsVariable = false;
  top.patternVariableName = nothing();
  top.patternSubPatternList = ps.patternList;
  top.patternSortKey = prod.lookupValue.fullName;
} 

{--
 - Match anything, and bind nothing.
 -}
concrete production wildcPattern
top::Pattern ::= '_'
{
  top.pp = "_";
  top.errors := [];

  top.patternIsVariable = true;
  top.patternVariableName = nothing();
  top.patternSubPatternList = [];
  top.patternSortKey = "~var";
}

{--
 - Match anything, bind it to a name.
 - Note 1: must be lower case, to avoid newbie confusions "case (e::a) of Expr -> ..."
 - Note 2: must not shadow a production name, to avoid "forgot parens" confusion
 -   (e.g. "case maybe of nothing -> ..." vs "nothing()")
 -}
concrete production varPattern
top::Pattern ::= v::Name
{
  top.pp = v.name;
  top.errors := 
    (if isUpper(substring(0,1,v.name))
     then [err(v.location, "Pattern variable names start with a lower case letter")]
     else []) ++
    (case getValueDcl(v.name, top.env) of
     | prodDcl(_,_,_) :: _ ->
         [err(v.location, "Pattern variables should not share the name of a production. (Potential confusion between '" ++ v.name ++ "' and '" ++ v.name ++ "()')")]
     | _ -> []
     end);

  top.patternIsVariable = true;
  top.patternVariableName = just(v.name);
  top.patternSubPatternList = [];
  top.patternSortKey = "~var";
}

aspect default production
top::Pattern ::=
{
  -- All other patterns should never set these to anything else, so let's default them.
  top.patternIsVariable = false;
  top.patternVariableName = nothing();
}

--------------------------------------------------------------------------------

-- Below are the non-canonical patterns, i.e. those for other types

concrete production intPattern
top::Pattern ::= num::Int_t
{
  top.pp = num.lexeme;
  top.errors := [];
  
  top.patternSubPatternList = [];
  top.patternSortKey = num.lexeme;
}

concrete production strPattern
top::Pattern ::= str::String_t
{
  top.pp = str.lexeme;
  top.errors := [];
  
  top.patternSubPatternList = [];
  top.patternSortKey = str.lexeme;
}

concrete production truePattern
top::Pattern ::= 'true'
{
  top.pp = "true";
  top.errors := [];
  
  top.patternSubPatternList = [];
  top.patternSortKey = "true";
}

concrete production falsePattern
top::Pattern ::= 'false'
{
  top.pp = "false";
  top.errors := [];
  
  top.patternSubPatternList = [];
  top.patternSortKey = "false";
}

abstract production nilListPattern
top::Pattern ::= '[' ']'
{
  top.pp = "[]";
  top.errors := [];
  
  top.patternSubPatternList = [];
  top.patternSortKey = "core:nil";
}

concrete production consListPattern
top::Pattern ::= hp::Pattern '::' tp::Pattern
{
  top.pp = hp.pp ++ "::" ++ tp.pp;
  top.errors := hp.errors ++ tp.errors;
  
  top.patternSubPatternList = [hp, tp];
  top.patternSortKey = "core:cons";
}

-- List literal patterns
concrete production listPattern
top::Pattern ::= '[' ps::PatternList ']'
{
  top.pp = s"[${ps.pp}]";
  forwards to ps.asListPattern;
}

synthesized attribute asListPattern::Pattern occurs on PatternList;

aspect production patternList_one
top::PatternList ::= p::Pattern
{
  top.asListPattern = 
    consListPattern(p, '::', nilListPattern('[', ']', location=top.location), location=top.location);
}
aspect production patternList_more
top::PatternList ::= p::Pattern ',' ps1::PatternList
{
  top.asListPattern = consListPattern(p, '::', ps1.asListPattern, location=top.location);
}
aspect production patternList_nil
top::PatternList ::=
{
  top.asListPattern = nilListPattern('[', ']', location=top.location);
}
