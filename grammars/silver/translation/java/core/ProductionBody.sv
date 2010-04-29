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

attribute attrName occurs on ForwardLHSExpr;

attribute setupInh, translation occurs on ProductionBody, ProductionStmts, ProductionStmt, ForwardInhs, ForwardInh;

aspect production defaultProductionBody
top::ProductionBody ::= stmts::ProductionStmts
{
  top.setupInh := stmts.setupInh;
  top.translation = stmts.translation;
}

aspect production productionStmtsNone
top::ProductionStmts ::= 
{
  top.setupInh := "";
  top.translation = "";
}

aspect production productionStmts
top::ProductionStmts ::= stmt::ProductionStmt
{
  top.setupInh := stmt.setupInh;
  top.translation = stmt.translation;
}

aspect production productionStmtsCons
top::ProductionStmts ::= h::ProductionStmt t::ProductionStmts
{
  top.setupInh := h.setupInh ++ t.setupInh;
  top.translation = h.translation ++ t.translation;
}

aspect production productionStmtsAppend
top::ProductionStmts ::= h::ProductionStmts t::ProductionStmts
{
  top.setupInh := h.setupInh ++ t.setupInh;
  top.translation = h.translation ++ t.translation;
}

aspect production forwardsTo
top::ProductionStmt ::= 'forwards' 'to' e::Expr ';'
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  top.setupInh := "";
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

  top.setupInh := "";
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
  top.setupInh := "";
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
  top.setupInh := if !te.typerep.isNonTerminal then  "" else
        	 "\t\t//" ++ top.pp ++ "\n" ++
		 "\t\t" ++ 
		 makeClassName(top.signature.fullName) ++ ".inheritedAttributes.put(\"" ++ fName ++ "\", " ++ 
										    "new java.util.TreeMap<String, common.Lazy>());\n";
  top.translation = "";
}

aspect production productionAttributeDcl
top::ProductionStmt ::= 'production' 'attribute' a::Name '::' te::Type ';'
{
  top.setupInh := if !te.typerep.isNonTerminal then  "" else
	   	"\t\t//" ++ top.pp ++ "\n" ++		 
		"\t\t" ++ 
		 makeClassName(top.signature.fullName) ++ ".inheritedAttributes.put(\"" ++ fName ++ "\", " ++ 
										    "new java.util.TreeMap<String, common.Lazy>());\n";
  top.translation = "";
}

aspect production normalAttributeDef
top::ProductionStmt ::= val::QName '.' attr::QName '=' e::Decorated Expr
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  local attribute fNames1 :: [Decorated EnvItem];
  fNames1 = getFullNameDcl(val.name, top.env);

  local attribute fName1 :: String;
  fName1 = if !null(fNames1) then head(fNames1).fullName else val.name;

  local attribute fNames2 :: [Decorated EnvItem];
  fNames2 = getFullNameDcl(attr.name, top.env);

  local attribute fName2 :: String;
  fName2 = if !null(fNames2) then head(fNames2).fullName else attr.name;

  top.setupInh := "";
  top.translation =
	"\t\t// " ++ val.pp ++ "." ++ attr.pp ++ " = " ++ e.pp ++ "\n" ++
	if !null(getValueDcl(fName1, top.localsEnv)) then 
	"\t\t" ++ className ++ ".inheritedAttributes.get(\"" ++ fName1 ++ "\").put(\"" ++ fName2 ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n"
	else if contains(val.name, getNamesSignature(top.signature.inputElements)) then 
	"\t\t" ++ className ++ ".inheritedAttributes.get(" ++ className ++ ".i_" ++ fName1 ++ ").put(\"" ++ fName2 ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n"
	else -- id.name == top.signature.outputElement.elementName
	"\t\t" ++ className ++ ".synthesizedAttributes.put(\"" ++ fName2 ++ "\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n";
}

aspect production normalValueDef
top::ProductionStmt ::= val::QName '=' e::Decorated Expr
{
  local attribute className :: String;
  className = makeClassName(top.signature.fullName);

  local attribute fNames :: [Decorated EnvItem];
  fNames = getFullNameDcl(val.name, top.env);

  local attribute fName :: String;
  fName = if !null(fNames) then head(fNames).fullName else val.name;

  top.setupInh := "";
  top.translation =
	"\t\t// " ++ val.pp ++ " = " ++ e.pp ++ "\n" ++
	"\t\t" ++ className ++ ".localAttributes.put(\"" ++ fName ++ "\", new common.Lazy(){\n" ++ 
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

  top.setupInh := "";
  top.translation =
	"\t\t//" ++ top.pp ++ "\n" ++
	"\t\t" ++ className ++ ".synthesizedAttributes.put(\"__return\", new common.Lazy(){\n" ++ 
	"\t\t\tpublic Object eval(common.DecoratedNode context) {\n" ++
	"\t\t\t\treturn " ++ e.translation ++ ";\n" ++
	"\t\t\t}\n" ++
	"\t\t});\n";
}

