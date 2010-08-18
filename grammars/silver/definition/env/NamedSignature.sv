grammar silver:definition:env;

import silver:definition:type;

nonterminal NamedSignature with inputElements, outputElement, fullName, unparse;
nonterminal NamedSignatureElement with typerep, elementName, unparse;

synthesized attribute elementName :: String;
synthesized attribute inputElements :: [Decorated NamedSignatureElement];
synthesized attribute outputElement :: Decorated NamedSignatureElement;


function getTypesSignature
[TypeExp] ::= ns::[Decorated NamedSignatureElement]
{
 return if null(ns) then [] else [head(ns).typerep] ++ getTypesSignature(tail(ns));  
}

function getNamesSignature
[String] ::= ns::[Decorated NamedSignatureElement]
{
 return if null(ns) then [] else [head(ns).elementName] ++ getNamesSignature(tail(ns));  
}

-- Used by concrete syntax to get names of nonterminals/terminals.
function getTypeNamesSignature
[String] ::= ns::[Decorated NamedSignatureElement]
{
 return if null(ns) then [] else [head(ns).typerep.typeName] ++ getTypeNamesSignature(tail(ns));  
}

function unparseSignatureElements
String ::= s::[Decorated NamedSignatureElement]
{
  return "[" ++ unparseSignatureElementsHelp(s) ++ "]";
}

function unparseSignatureElementsHelp
String ::= s::[Decorated NamedSignatureElement]
{
  return if null(s) then "" else head(s).unparse ++ (if null(tail(s)) then "" else (", " ++ unparseSignatureElementsHelp(tail(s))));
}

function namedNamedSignature
Decorated NamedSignature ::= fn::String
{
  return decorate i_namedSignature(fn, [], decorate namedSignatureElementDefault() with {}) with {};
}

function namedSignatureDcl
Decorated NamedSignature ::= fn::String ie::[Decorated NamedSignatureElement] oe::Decorated NamedSignatureElement
{
  return decorate i_namedSignature(fn, ie, oe) with {};
}

abstract production i_namedSignature
top::NamedSignature ::= fn::String ie::[Decorated NamedSignatureElement] oe::Decorated NamedSignatureElement
{
  top.unparse = "signature('" ++ fn ++ "', " ++ unparseSignatureElements(ie) ++ ", " ++ oe.unparse ++ ")";
  top.fullName = fn;
  top.inputElements = ie;
  top.outputElement = oe;
}

abstract production namedSignatureDefault
top::NamedSignature ::= 
{
  top.unparse = "signature";
  top.fullName = "_NULL_";
  top.inputElements = [];
  top.outputElement = decorate namedSignatureElementDefault() with {};
}

function namedSignatureElement
Decorated NamedSignatureElement ::= n::String tr::TypeExp
{
  return decorate i_namedSignatureElement(n, tr) with {};
}

abstract production i_namedSignatureElement
top::NamedSignatureElement ::= n::String ty::TypeExp
{
  top.unparse = "element('" ++ n ++ "', " ++ unparseType(ty) ++ ")";

  top.elementName = n;
  top.typerep = ty;
}

abstract production namedSignatureElementDefault
top::NamedSignatureElement ::=
{
  top.unparse = "element";
  top.elementName = "_NULL_";
  top.typerep = errorType();
}
