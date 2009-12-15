grammar silver:translation:java:core;
import silver:definition:core;
import silver:definition:env;
import silver:util;

synthesized attribute nodeName :: String;
synthesized attribute attrName :: String;
synthesized attribute isLocal :: Boolean;
synthesized attribute isLocalDcl :: Boolean;
synthesized attribute isChild :: Boolean;
synthesized attribute isParent :: Boolean;

attribute nodeName, attrName, isLocal, isLocalDcl, isChild, isParent occurs on LHSExpr;
attribute attrName occurs on ForwardLHSExpr;

attribute setupInh, translation occurs on ProductionBody, ProductionStmts, ProductionStmt, ForwardInhs, ForwardInh;

aspect production defaultProductionBody
top::ProductionBody ::= stmts::ProductionStmts
{
  top.setupInh = stmts.setupInh;
  top.translation = stmts.translation;
}

aspect production productionStmtsNone
top::ProductionStmts ::= 
{
  top.setupInh = "";
  top.translation = "";
}

aspect production productionStmts
top::ProductionStmts ::= stmt::ProductionStmt
{
  top.setupInh = stmt.setupInh;
  top.translation = stmt.translation;
}

aspect production productionStmtsCons
top::ProductionStmts ::= h::ProductionStmt t::ProductionStmts
{
  top.setupInh = h.setupInh ++ t.setupInh;
  top.translation = h.translation ++ t.translation;
}

aspect production productionStmtsAppend
top::ProductionStmts ::= h::ProductionStmts t::ProductionStmts
{
  top.setupInh = h.setupInh ++ t.setupInh;
  top.translation = h.translation ++ t.translation;
}

aspect production forwardsTo
top::ProductionStmt ::= 'forwards' 'to' e::Expr ';'
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  top.setupInh = "";
  top.translation = 
	"\t\t//" ++ top.pp ++ "\n" ++
	"\t\t" ++ className ++ ".forward = new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t};\n";
}

aspect production forwardsToWith
top::ProductionStmt ::= 'forwards' 'to' e::Expr 'with' '{' inh::ForwardInhs '}' ';'
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  top.setupInh = "";
  top.translation =
	"\t\t//" ++ top.pp ++ "\n" ++
	"\t\t" ++ className ++ ".forward = new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t};\n" ++
  	inh.translation;
}

aspect production forwardingWith
top::ProductionStmt ::= 'forwarding' 'with' '{' inh::ForwardInhs '}' ';'
{
  top.setupInh = "";
  top.translation = inh.translation;   
}

aspect production forwardInh
top::ForwardInh ::= lhs::ForwardLHSExpr '=' e::Expr ';'
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  top.translation = 
	"\t\t//" ++ top.pp ++ "\n" ++
	"\t\t" ++ className ++ ".forwardAttributes.put(\"" ++ lhs.attrName ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n";

}

aspect production forwardInhsOne
top::ForwardInhs ::= lhs::ForwardInh
{
  top.translation = lhs.translation;
}

aspect production forwardInhsCons
top::ForwardInhs ::= lhs::ForwardInh rhs::ForwardInhs
{
  top.translation = lhs.translation ++ rhs.translation;
}

aspect production forwardLhsExpr
top::ForwardLHSExpr ::= q::QName
{
  top.attrName = fName;  
}

aspect production localAttributeDcl
top::ProductionStmt ::= 'local' 'attribute' a::Name '::' te::Type ';'
{
  top.setupInh = if !te.typerep.isNonTerminal then  "" else
        	 "\t\t//" ++ top.pp ++ "\n" ++
		 "\t\t" ++ 
		 makeClassName(top.signature.fullName) ++ ".inheritedAttributes.put(\"" ++ fName ++ "\", " ++ 
										    "new java.util.TreeMap<String, common.Lazy>());\n";
  top.translation = "";
}

aspect production productionAttributeDcl
top::ProductionStmt ::= 'production' 'attribute' a::Name '::' te::Type ';'
{
  top.setupInh = if !te.typerep.isNonTerminal then  "" else
	   	"\t\t//" ++ top.pp ++ "\n" ++		 
		"\t\t" ++ 
		 makeClassName(top.signature.fullName) ++ ".inheritedAttributes.put(\"" ++ fName ++ "\", " ++ 
										    "new java.util.TreeMap<String, common.Lazy>());\n";
  top.translation = "";
}

aspect production attributeDef
top::ProductionStmt ::= lhs::LHSExpr '=' e::Expr ';'
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  top.setupInh = "";
  top.translation =
	"\t\t//" ++ top.pp ++ "\n" ++
	if lhs.isLocalDcl then  
	"\t\t" ++ className ++ ".localAttributes.put(\"" ++ lhs.nodeName ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n"
	else if lhs.isLocal then 
	"\t\t" ++ className ++ ".inheritedAttributes.get(\"" ++ lhs.nodeName ++ "\").put(\"" ++ lhs.attrName ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n"
	else if lhs.isChild then 
	"\t\t" ++ className ++ ".inheritedAttributes.get(" ++ className ++ ".i_" ++ lhs.nodeName ++ ").put(\"" ++ lhs.attrName ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n"

	else
	"\t\t" ++ className ++ ".synthesizedAttributes.put(\"" ++ lhs.attrName ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n";
}

aspect production returnDef
top::ProductionStmt ::= 'return' e::Expr ';'
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  top.setupInh = "";
  top.translation =
	"\t\t//" ++ top.pp ++ "\n" ++
	"\t\t" ++ className ++ ".synthesizedAttributes.put(\"__return\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n";
}

aspect production fakeLHSExpr
top::LHSExpr ::= c1::QName c2::Decorated TypeRep
{
  top.nodeName = "_NULL_";
  top.attrName = c1.name;

  top.isLocal = false;
  top.isLocalDcl = false;
  top.isChild = false;
  top.isParent = false;
}

aspect production lhsExprOne
top::LHSExpr ::= id::Name
{
  top.nodeName = fName;
  top.attrName = "_NULL_";

  top.isLocal = false;
  top.isLocalDcl = true;
  top.isChild = false;
  top.isParent = false;
}

aspect production lhsExprTwo
top::LHSExpr ::= id::Name '.' q::QName
{
  top.nodeName = fName1;
  top.attrName = fName2;

  top.isLocal = !null(getValueDcl(fName1, top.localsEnv));
  top.isLocalDcl = false;
  top.isChild = contains(id.name, getNamesSignature(top.signature.inputElements));
  top.isParent = id.name == top.signature.outputElement.elementName;
}
