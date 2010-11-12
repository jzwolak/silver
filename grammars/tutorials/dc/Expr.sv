grammar tutorials:dc ;

-- Concrete Syntax --
---------------------

synthesized attribute ast_Expr :: Expr ;

nonterminal Expr_c with pp, ast_Expr;
nonterminal Term_c with pp, ast_Expr;
nonterminal Factor_c with pp, ast_Expr;
nonterminal Base_c with pp, ast_Expr;

{- Note about this concrete syntax: We're choosing to use the
   Expr/Term/Factor/Base decomposition here.  Silver also supports the
   commonly used 'association' and 'precedence' specifications. See
   comments in Terminals.sv for more details.  -}

concrete production add_c
sum::Expr_c ::= e::Expr_c '+' t::Term_c
{
 sum.pp = e.pp ++ " + " ++ t.pp ;
 sum.ast_Expr = add(e.ast_Expr, t.ast_Expr );
}

concrete production sub_c
dff::Expr_c ::= e::Expr_c '-' t::Term_c
{
 dff.pp = e.pp ++ " - " ++ t.pp ;
 dff.ast_Expr = sub(e.ast_Expr, t.ast_Expr);
}

concrete production exprTerm_c
e::Expr_c ::= t::Term_c
{
 e.pp = t.pp ;
 e.ast_Expr = t.ast_Expr ;
}

concrete production mul_c
prd::Term_c ::= t::Term_c '*' f::Factor_c
{
 prd.pp = t.pp ++ " * " ++ f.pp ;
 prd.ast_Expr = mul(t.ast_Expr, f.ast_Expr);
}

concrete production div_c
d::Term_c ::= t::Term_c '/' f::Factor_c
{
 d.pp = t.pp ++ " / " ++ f.pp ;
 d.ast_Expr = div(t.ast_Expr, f.ast_Expr);
}

concrete production termFactor_c
t::Term_c ::= f::Factor_c
{
 t.pp = f.pp ;
 t.ast_Expr = f.ast_Expr ;
}

concrete production power_c
pwr::Factor_c ::= b::Base_c '^' f::Factor_c
{
 pwr.pp = b.pp ++ " ^ " ++ f.pp ;
 pwr.ast_Expr = power(b.ast_Expr, f.ast_Expr );
}

concrete production factorBase_c
f::Factor_c ::= b::Base_c
{
 f.pp = b.pp ;
 f.ast_Expr = b.ast_Expr ;
}

concrete production nested_c
e::Base_c ::= '(' inner::Expr_c ')'
{
 e.pp = "(" ++ inner.pp ++ ")" ;
 e.ast_Expr = inner.ast_Expr ;
}

concrete production integerConstant_c
ic::Base_c ::= i::IntLit_t
{
 ic.pp = i.lexeme ;
 ic.ast_Expr = integerConstant(i);
}


-- Abstract Syntax --
---------------------

nonterminal Expr with pp, value;

abstract production power
pwr::Expr ::= l::Expr r::Expr
{
 pwr.pp = "(" ++ l.pp ++ " ^ " ++ r.pp ++ ")";
 pwr.value = computePower(l.value,r.value) ;
}

function computePower
Integer ::= x::Integer n::Integer
{
 return if n == 0
        then 1
        else x * computePower(x, n-1) ;
}

abstract production add
sum::Expr ::= l::Expr r::Expr
{
 sum.pp = "(" ++ l.pp ++ " + " ++ r.pp ++ ")";
 sum.value = l.value + r.value ;
}

abstract production sub
dff::Expr ::= l::Expr r::Expr
{
 dff.pp = "(" ++ l.pp ++ " - " ++ r.pp ++ ")";
 dff.value = l.value - r.value ;
}

abstract production mul
prd::Expr ::= l::Expr r::Expr
{
 prd.pp = "(" ++ l.pp ++ " * " ++ r.pp ++ ")";
 prd.value = l.value * r.value ;
}

abstract production div
quo::Expr ::= l::Expr r::Expr
{
 quo.pp = "(" ++ l.pp ++ " / " ++ r.pp ++ ")";
 quo.value = toInt ( toFloat(l.value) / toFloat(r.value) ) ;
}

abstract production integerConstant
e::Expr ::= i::IntLit_t
{
 e.pp = i.lexeme ;
 e.value = toInt(i.lexeme);
}



