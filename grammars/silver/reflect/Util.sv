grammar silver:reflect;

imports silver:reflect:concretesyntax;
import silver:langutil;

function reflect
AST ::= x::a
{
  return error("Foreign function");
} foreign {
  "java" : return "(common.Reflection.reflect(%x%))";
}

function reflectTypeName
Maybe<String> ::= x::a
{
  return error("Foreign function");
} foreign {
  "java" : return "(common.Reflection.reflectTypeName(%x%))";
}

function nativeToString
String ::= x::a
{
  return error("Foreign function");
} foreign {
  "java" : return "(new common.StringCatter(%x%.toString()))";
}

parser astParser :: AST_c {
  silver:reflect:concretesyntax;
}

function deserializeAST
Either<String AST> ::= fileName::String text::String
{
  local result::ParseResult<AST_c> = astParser(text, fileName);

  return
    if result.parseSuccess
    then right(result.parseTree.ast)
    else left(result.parseErrors);
}
