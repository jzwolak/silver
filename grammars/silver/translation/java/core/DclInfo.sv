grammar silver:translation:java:core;

import silver:util;

attribute attrOccursIndexName, attrOccursIndex occurs on DclInfo;

{--
 - The name of the occurs variable. e.g. silver_def_core_pp__ON__silver_def_core_Expr
 -}
synthesized attribute attrOccursIndexName :: String;
{--
 - Index of the attribute. e.g. silver.def.core.silver_def_core_pp__ON__silver_def_core_Expr
 -}
synthesized attribute attrOccursIndex :: String;

aspect default production
top::DclInfo ::=
{
  -- See TODO in the env DclInfo
  top.attrOccursIndexName = error("Internal compiler error: must be defined for all occurs declarations");
  top.attrOccursIndex = error("Internal compiler error: must be defined for all occurs declarations");
}


aspect production occursDcl
top::DclInfo ::= sg::String sl::Location fnnt::String fnat::String ntty::TypeExp atty::TypeExp
{
  top.attrOccursIndexName = makeIdName(fnat ++ "__ON__" ++ fnnt);
  top.attrOccursIndex = makeName(sg) ++ ".Init." ++ top.attrOccursIndexName;
}
aspect production annoInstanceDcl
top::DclInfo ::= sg::String sl::Location fnnt::String fnat::String ntty::TypeExp atty::TypeExp
{
  top.attrOccursIndexName = error("Not actually an attribute");
  top.attrOccursIndex = error("Not actually an attribute");
}


aspect production localDcl
top::DclInfo ::= sg::String sl::Location fn::String ty::TypeExp
{
  -- TODO: BUG: See https://github.com/melt-umn/silver/issues/52
  -- This is the kind of nasty hack that we might fix with a FullName type, instead of hacking on 'fn'
  -- Also, this choice of name is actually buggy! Can cause java compiler errors with name collisions.
  local attribute li :: Integer;
  li = lastIndexOf(":local:", fn);
  top.attrOccursIndexName = makeIdName(substring(li+7, length(fn), fn) ++ "__ON__" ++ substring(0,li,fn));
  top.attrOccursIndex = makeName(sg) ++ ".Init." ++ top.attrOccursIndexName;
}

