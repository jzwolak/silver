grammar silver:modification:defaultattr;

import silver:definition:core;
import silver:definition:env;
import silver:definition:type;
import silver:definition:type:syntax;
--import silver:analysis:typechecking:core;
import silver:translation:java;


terminal Default_kwd 'default' lexer classes {KEYWORD, RESERVED};

concrete production aspectDefaultProduction
top::AGDcl ::= 'aspect' 'default' 'production' 
               lhs::Name '::' te::TypeExpr '::=' body::ProductionBody 
{
  top.pp = "aspect default production\n" ++ lhs.pp ++ "::" ++ te.pp ++ " ::=\n" ++ body.pp;

  top.defs = [];

  production namedSig :: NamedSignature = 
    namedSignature(top.grammarName ++ ":default" ++ te.typerep.typeName, [],
      namedSignatureElement(lhs.name, te.typerep),
      annotationsForNonterminal(te.typerep, top.env));

  top.errors := te.errors ++ body.errors;

  local fakedDefs :: [Def] =
    [defaultLhsDef(top.grammarName, lhs.location, lhs.name, te.typerep)];
  
  local sigDefs :: [Def] =
    addNewLexicalTyVars_ActuallyVariables(top.grammarName, top.location, te.lexicalTypeVariables);

  body.env = newScopeEnv(fakedDefs ++ sigDefs, top.env);
  body.frame = defaultAspectContext(namedSig);

  body.downSubst = emptySubst();

  top.setupInh := body.setupInh; -- Probably should be empty?
  top.initProd := "\t\t//ASPECT DEFAULT PRODUCTION for " ++ te.pp ++ "\n" ++ body.translation;
  top.valueWeaving := body.valueWeaving; -- Probably should be empty?
}

function defaultLhsDef
Def ::= sg::String sl::Location fn::String ty::Type
{
  return valueDef(defaultEnvItem(defaultLhsDcl(sg,sl,fn,ty)));
}
abstract production defaultLhsDcl
top::DclInfo ::= sg::String sl::Location fn::String ty::Type
{
  top.sourceGrammar = sg;
  top.sourceLocation = sl;
  top.fullName = fn;

  top.unparse = error("INTERNAL ERROR: default-lhs values should never appear in interface files");
  
  top.typerep = ty;
  
  top.refDispatcher = lhsReference(_, location=_);
  top.defDispatcher = errorValueDef(_, _, location=_); -- TODO: be smarter about the error message
  top.defLHSDispatcher = defaultLhsDefLHS(_, location=_);
}

abstract production defaultLhsDefLHS
top::DefLHS ::= q::Decorated QName
{
  top.pp = q.pp;
  top.found = !existingProblems && top.defLHSattr.attrDcl.isSynthesized;
  
  local existingProblems :: Boolean = !top.defLHSattr.found || top.typerep.isError;
  
  top.errors :=
    if existingProblems || top.found then []
    else [err(q.location, "Cannot define inherited attribute '" ++ top.defLHSattr.pp ++ "' on the lhs '" ++ q.pp ++ "'")];
  
  top.typerep = q.lookupValue.typerep;

  top.translation = makeNTClassName(top.frame.lhsNtName) ++ ".defaultSynthesizedAttributes";
}

abstract production defaultAspectContext
top::BlockContext ::= sig::NamedSignature  -- okay, sorta has a sig?
{
  top.fullName = sig.fullName;
  top.lhsNtName = sig.outputElement.typerep.typeName;
  top.signature = sig;
}

