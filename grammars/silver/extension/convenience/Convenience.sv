grammar silver:extension:convenience;

imports silver:definition:env;
imports silver:definition:core;
imports silver:definition:concrete_syntax;
imports silver:definition:type;
imports silver:definition:type:syntax;

-- Multiple attribute occurs on statements
concrete production multipleAttributionDclsManyMany
top::AGDcl ::= 'attribute' a::QNames2 'occurs' 'on' nts::QNames2 ';'
{
  top.pp = "attribute " ++ a.pp ++ " occurs on " ++ nts.pp ++ " ;" ;
  forwards to makeOccursDcls(top.location, a.qnames, nts.qnames);
}
concrete production multipleAttributionDclsSingleMany
top::AGDcl ::= 'attribute' a::QName tl::BracketedOptTypeExprs 'occurs' 'on' nts::QNames2 ';' 
{
  top.pp = "attribute " ++ a.pp ++ " occurs on " ++ nts.pp ++ " ;" ;
  forwards to makeOccursDcls(top.location, [qNameWithTL(a, tl)], nts.qnames);
}
concrete production multipleAttributionDclsManySingle
top::AGDcl ::= 'attribute' a::QNames2 'occurs' 'on' nts::QNameWithTL ';'
{
  top.pp = "attribute " ++ a.pp ++ " occurs on " ++ nts.pp ++ " ;" ;
  forwards to makeOccursDcls(top.location, a.qnames, [nts]);
}

-- Multiple annotation occurs on statements
concrete production multipleAnnotationDclsManyMany
top::AGDcl ::= 'annotation' a::QNames2 'occurs' 'on' nts::QNames2 ';'
{
  top.pp = "annotation " ++ a.pp ++ " occurs on " ++ nts.pp ++ " ;" ;
  forwards to makeOccursDcls(top.location, a.qnames, nts.qnames);
}
concrete production multipleAnnotationDclsSingleMany
top::AGDcl ::= 'annotation' a::QName tl::BracketedOptTypeExprs 'occurs' 'on' nts::QNames2 ';' 
{
  top.pp = "annotation " ++ a.pp ++ " occurs on " ++ nts.pp ++ " ;" ;
  forwards to makeOccursDcls(top.location, [qNameWithTL(a, tl)], nts.qnames);
}
concrete production multipleAnnotationDclsManySingle
top::AGDcl ::= 'annotation' a::QNames2 'occurs' 'on' nts::QNameWithTL ';'
{
  top.pp = "annotation " ++ a.pp ++ " occurs on " ++ nts.pp ++ " ;" ;
  forwards to makeOccursDcls(top.location, a.qnames, [nts]);
}



concrete production nonterminalWithDcl
top::AGDcl ::= cl::ClosedOrNot 'nonterminal' id::Name tl::BracketedOptTypeExprs 'with' attrs::QNames ';'
{
  top.pp = "nonterminal " ++ id.pp ++ tl.pp ++ " with " ++ attrs.pp ++ " ;";
  forwards to appendAGDcl(
    nonterminalDcl(cl, $2, id, tl, $7, location=top.location),
    makeOccursDcls(top.location, attrs.qnames, [qNameWithTL(qNameId(id, location=id.location), tl)]),
    location=top.location);
}



concrete production attributeDclInhMultiple
top::AGDcl ::= 'inherited' 'attribute' a::Name tl::BracketedOptTypeExprs '::' te::TypeExpr 'occurs' 'on' qs::QNames ';'
{
  top.pp = "inherited attribute " ++ a.name ++ tl.pp ++ " :: " ++ te.pp ++ " occurs on " ++ qs.pp ++ ";" ;
  forwards to appendAGDcl(
    attributeDclInh($1, $2, a, tl, $5, te, $10, location=top.location),
    makeOccursDclsHelp(top.location, qNameWithTL(qNameId(a, location=a.location), tl), qs.qnames),
    location=top.location);
}

concrete production attributeDclSynMultiple
top::AGDcl ::= 'synthesized' 'attribute' a::Name tl::BracketedOptTypeExprs '::' te::TypeExpr 'occurs' 'on' qs::QNames ';'
{
  top.pp = "synthesized attribute " ++ a.name ++ tl.pp ++ " :: " ++ te.pp ++ " occurs on " ++ qs.pp ++ ";" ;
  forwards to appendAGDcl(
    attributeDclSyn($1, $2, a, tl, $5, te, $10, location=top.location),
    makeOccursDclsHelp(top.location, qNameWithTL(qNameId(a, location=a.location), tl), qs.qnames),
    location=top.location);
}




{- TEMPORARILY(?) DISABLED this aren't commonly used anyhow




concrete production nonterminalWithDcl3
top::AGDcl ::= 'nonterminal' id::Names2 ';'
{
  top.pp = "nonterminal " ++ id.pp ++ " ;" ;
  forwards to makeNTDcls($1.line, $1.column, id.ids) ;
}
concrete production attributeDclInhMultiple1
top::AGDcl ::= 'inherited' 'attribute' a::Names2 '::' te::TypeExpr 'occurs' 'on' qs::QNames ';'
{
  top.pp = "inherited attribute " ++ a.pp ++ " :: " ++ te.pp ++ " occurs on " ++ qs.pp ++ ";" ;
  forwards to appendAGDcl(makeInhDcls($1.line, $1.column, te, a.ids), makeOccursDcls($1.line, $1.column, qualifyNames(a.ids), qs.qnames));
}
concrete production attributeDclSynMultiple1
top::AGDcl ::= 'synthesized' 'attribute' a::Names2 '::' te::TypeExpr 'occurs' 'on' qs::QNames ';'
{
  top.pp = "synthesized attribute " ++ a.pp ++ " :: " ++ te.pp ++ " occurs on " ++ qs.pp ++ ";" ;
  forwards to appendAGDcl(makeSynDcls($1.line, $1.column, te, a.ids), makeOccursDcls($1.line, $1.column, qualifyNames(a.ids), qs.qnames));
}



-}
