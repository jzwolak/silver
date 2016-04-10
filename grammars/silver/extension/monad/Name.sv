-- Exact copy of Name, but productions have higher precedence.
-- This is needed to avoid a parse conflict with '::' as both the type and cons operator  

nonterminal MName with config, grammarName, location, pp, name;

synthesized attribute name :: String;

concrete production mNameIdLower
top::MName ::= id::IdLower_t
precedence=2
{
  top.name = id.lexeme;
  top.pp = id.lexeme;
}
concrete production mNameIdUpper
top::MName ::= id::IdUpper_t
precedence=2
{
  top.name = id.lexeme;
  top.pp = id.lexeme;
}

function nameFromMName
Name ::= n::MName
{
  return name(n.name, n.location);
}

function mName
MName ::= n::String l::Location
{
  return mNameIdLower(terminal(IdLower_t, n, l), location=l);
}

