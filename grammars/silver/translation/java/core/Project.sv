grammar silver:translation:java:core;

imports silver:translation:java:type;

imports silver:definition:core;
imports silver:definition:type:syntax;

imports silver:definition:env;
imports silver:definition:type;


import silver:util;

function makeName
String ::= str::String
{
  return substitute(".", ":", str);
}

function makeClassName
String ::= s::String{
  return makeClassNameHelp(explode(":", s), "P");
}

function makeNTClassName
String ::= s::String {
  return makeClassNameHelp(explode(":", s), "N");
}

function makeParserName
String ::= s::String{
  return"Parser_" ++ substitute("_", ":", s);
}

function makeClassNameHelp -- TODO: get a native replace and do this more intelligently...
String ::= s::[String] prfix::String{
  return if null(s) then "" else if null(tail(s)) then prfix ++ head(s) else (head(s) ++ "." ++ makeClassNameHelp(tail(s), prfix));
}

