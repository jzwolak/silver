
import core:reflect;
import silver:langutil;
import silver:langutil:pp;

annotation lineNum::Integer;

nonterminal Expr with lineNum;

abstract production addExpr
top::Expr ::= e1::Expr e2::Expr
{}

abstract production intConstExpr
top::Expr ::= i::Integer
{}

abstract production idExpr
top::Expr ::= id::String
{}

abstract production decExpr
top::Expr ::= d::Decorated Expr
{}

global testExpr::Expr = addExpr(intConstExpr(2, lineNum=1), idExpr("asdf", lineNum=2), lineNum=3);

equalityTest(
  show(80, reflect([testExpr, intConstExpr(5, lineNum=4), decExpr(decorate testExpr with {}, lineNum=4)]).pp),
  s"""[silver_features:addExpr(silver_features:intConstExpr(2, silver_features:lineNum=1), silver_features:idExpr("asdf", silver_features:lineNum=2), silver_features:lineNum=3), silver_features:intConstExpr(5, silver_features:lineNum=4), silver_features:decExpr(<FOREIGN>, silver_features:lineNum=4)]""",
  String, silver_tests);

equalityTest(
  hackUnparse(reify(reflect([testExpr, intConstExpr(5, lineNum=4){-, decExpr(decorate testExpr with {}, lineNum=4)-}]))),
  hackUnparse([testExpr, intConstExpr(5, lineNum=4){-, decExpr(decorate testExpr with {}, lineNum=4)-}]),
  String, silver_tests);

equalityTest(
  hackUnparse(reify(reflect(pair(pair(1, 2), pair(3, 4))))),
  hackUnparse(pair(pair(1, 2), pair(3, 4))),
  String, silver_tests);
  
nonterminal Foo;

abstract production existentialFoo
top::Foo ::= a
{}

equalityTest(
  hackUnparse(reify(reflect(existentialFoo(existentialFoo(42))))),
  hackUnparse(existentialFoo(existentialFoo(42))),
  String, silver_tests);