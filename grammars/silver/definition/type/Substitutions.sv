grammar silver:definition:type;

nonterminal Substitution with debugOutput, substTyVars, substTyExps, substErrors, failure;

synthesized attribute debugOutput :: String;

-- TODO: This should be a list of pairs
synthesized attribute substTyVars :: [TyVar];
synthesized attribute substTyExps :: [TypeExp];

synthesized attribute substErrors :: [String];
synthesized attribute failure :: Boolean; -- this is a bad hack to work around unify being unable to return a pair

--------------------------------------------------------------------------------

abstract production emptySubst
top::Substitution ::=
{
  top.debugOutput = "";
  top.substTyVars = [];
  top.substTyExps = [];
  top.substErrors = [];
  top.failure = false;
}

abstract production errorSubst
top::Substitution ::= e::String
{
  top.debugOutput = "";
  top.substTyVars = [];
  top.substTyExps = [];
  top.substErrors = [e];
  top.failure = true;
}


abstract production subst
top::Substitution ::= tv::TyVar te::TypeExp
{
  top.debugOutput = toString(case tv of tyVar(i) -> i end) ++ " => " ++ prettyType(te);
  top.substTyVars = [tv];
  top.substTyExps = [te];
  top.substErrors = [];
  top.failure = false;
}

abstract production composeSubst
top::Substitution ::= s1::Substitution s2::Substitution
{
  top.debugOutput = s1.debugOutput ++ ", " ++ s2.debugOutput;
  top.substTyVars = s1.substTyVars ++ s2.substTyVars;
  top.substTyExps = s1.substTyExps ++ s2.substTyExps;
  top.substErrors = s1.substErrors ++ s2.substErrors;
  top.failure = s1.failure || s2.failure;
}

abstract production ignoreFailure
top::Substitution ::= s::Substitution
{
  top.failure = false;
  forwards to s;
}

--------------------------------------------------------------------------------

-- TODO: This should return Maybe TypeExp
function findSubst
TypeExp ::= tv::TyVar s::Substitution
{
  return findSubstHelp(tv, s.substTyVars, s.substTyExps);
}
function findSubstHelp
TypeExp ::= tv::TyVar sv::[TyVar] se::[TypeExp]
{
  return if null(sv) then varTypeExp(tv)
         else if tyVarEqual(tv, head(sv))
              then head(se)
              else findSubstHelp(tv, tail(sv), tail(se));
}

--------------------------------------------------------------------------------

autocopy attribute substitution :: Substitution occurs on TypeExp;
synthesized attribute substituted :: TypeExp occurs on TypeExp;

aspect production varTypeExp
top::TypeExp ::= tv::TyVar
{
  -- Important: we recursively substitute, until no more substitutions happen!
  -- This also means the substitution list must not be circular!

  -- Perform one iteration of substitution
  local attribute partialsubst :: TypeExp;
  partialsubst = findSubst(tv, top.substitution);
  
  -- Find out if we successfully substituted, or if we stayed the same
  local attribute successful :: Boolean;
  successful = case partialsubst of
                 varTypeExp(newtv) -> ! tyVarEqual(tv, new(newtv))
               | _ -> true
               end;
  
  -- recursively substitute only if we changed!
  top.substituted = if successful
                    then performSubstitution(partialsubst , top.substitution )
                    else top;
}

aspect production intTypeExp
top::TypeExp ::=
{
  top.substituted = top;
}

aspect production boolTypeExp
top::TypeExp ::=
{
  top.substituted = top;
}

aspect production floatTypeExp
top::TypeExp ::=
{
  top.substituted = top;
}

aspect production stringTypeExp
top::TypeExp ::=
{
  top.substituted = top;
}

aspect production nonterminalTypeExp
top::TypeExp ::= fn::String params::[TypeExp]
{
  top.substituted = nonterminalTypeExp(fn, mapSubst(params, top.substitution));
}

aspect production terminalTypeExp
top::TypeExp ::= fn::String
{
  top.substituted = top;
}

aspect production decoratedTypeExp
top::TypeExp ::= te::TypeExp
{
  top.substituted = decoratedTypeExp(te.substituted);
}

aspect production functionTypeExp
top::TypeExp ::= out::TypeExp params::[TypeExp]
{
  top.substituted = functionTypeExp(out.substituted, mapSubst(params, top.substitution));
}

aspect production productionTypeExp
top::TypeExp ::= out::TypeExp params::[TypeExp]
{
  top.substituted = productionTypeExp(out.substituted, mapSubst(params, top.substitution));
}

--------------------------------------------------------------------------------

function performSubstitution
TypeExp ::= te::TypeExp s::Substitution
{
  te.substitution = s;
  return te.substituted;
}

function mapSubst
[TypeExp] ::= tes::[TypeExp] s::Substitution
{
  return if null(tes) then []
         else performSubstitution(head(tes), s) :: mapSubst(tail(tes), s);
}

--------------------------------------------------------------------------------

function freshTyVars
[TyVar] ::= n::Integer
{
  return if n > 0 then freshTyVar() :: freshTyVars(n-1)
         else [];
}

function zipVarsIntoSubstitution
Substitution ::= original::[TyVar] sub::[TyVar]
{
  return if null(original) then emptySubst()
         else composeSubst( subst(head(original), varTypeExp(head(sub))), zipVarsIntoSubstitution(tail(original), tail(sub)));
}

function freshenTypeExp
TypeExp ::= te::TypeExp tvs::[TyVar]
{
  return freshenTypeExpWith(te, tvs, freshTyVars(length(tvs)));
}

function freshenTypeExpWith
TypeExp ::= te::TypeExp tvs::[TyVar] ntvs::[TyVar]
{
  return performSubstitution(te, zipVarsIntoSubstitution(tvs, ntvs));
}

