grammar silver:modification:ffi;

terminal FFI_kwd 'foreign' lexer classes {KEYWORD,RESERVED};

nonterminal FFIDefs with config, location, grammarName, errors, env, pp;
nonterminal FFIDef with config, location, grammarName, errors, env, pp;

concrete production functionDclFFI
top::AGDcl ::= 'function' id::Name ns::FunctionSignature body::ProductionBody 'foreign' '{' ffidefs::FFIDefs '}'
{
  top.pp = "function " ++ id.pp ++ "\n" ++ ns.pp ++ "\n" ++ body.pp ++ " foreign {\n" ++ ffidefs.pp ++ "}"; 

  production fName :: String = top.grammarName ++ ":" ++ id.name;
  production namedSig :: NamedSignature = ns.namedSignature;

  top.errors <- ffidefs.errors;

  -- Quick copy & paste to make signatures look right. Otherwise they contain errorTypes for
  -- type parameters
  production attribute sigDefs :: [Def] with ++;
  sigDefs := ns.defs;
  ns.signatureName = fName;
  ns.env = newScopeEnv(sigDefs, top.env);
  production attribute allLexicalTyVars :: [String];
  allLexicalTyVars = makeSet(ns.lexicalTypeVariables);
  sigDefs <- addNewLexicalTyVars(top.grammarName, top.location, allLexicalTyVars);

  -- TODO this is a BS use of forwarding and should be eliminated. body.env and .frame are all wrong locally...
  
  forwards to functionDcl($1, id, ns, body, location=top.location);
}

concrete production ffidefsOne
top::FFIDefs ::= one::FFIDef
{
  top.pp = one.pp;
  
  top.errors := one.errors;
}

concrete production ffidefsMany
top::FFIDefs ::= one::FFIDef more::FFIDefs
{
  top.pp = one.pp ++ more.pp;
  
  top.errors := one.errors ++ more.errors;
}

concrete production ffidef
top::FFIDef ::= name::String_t ':' 'return' code::String_t ';'
{
  top.pp = name.lexeme ++ ": return " ++ code.lexeme ++ ";\n";
  
  top.errors := [];
  -- Up to each translation to do something with this.
}

