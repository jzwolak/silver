---
layout: sv_wiki
title: Lambda
---

```
foldr(\a::Integer b::Integer -> a + b, 0, [1, 2, 3, 4])
```

## Syntax

\ {Parameters, same as production RHS} -> result

You don't need to explicitly provide the return type, only the parameter types.  

## Semantics

Functions generated by a lambda expression have exactly the same semantics as a normal function.  They can be applied, partially applied, passed as parameters, etc.  

Any values in scope are implicitly captured and can be used, even if the resulting function is passed outside the scope of the captured values.  

There is really no interaction or special behavior with nonterminals/flow analysys/etc.  Decorated and undecorated nonterminals can be captured and used as parameters as expected.  
