
function makeInc
(Integer ::= Integer) ::= i::Integer
{
  return \ x::Integer -> x + i;
}

global addThree::(Integer ::= Integer) = makeInc(3);
equalityTest(addThree(4), 7, Integer, silver_tests);

global sumTwo::(Integer ::= Integer Integer) = \ x::Integer y::Integer -> x + y;
equalityTest(sumTwo(4, 5), 9, Integer, silver_tests);

global curriedSum::((Integer ::= Integer) ::= Integer) = \ x::Integer -> \ y::Integer -> x + y;
equalityTest(curriedSum(1)(2), 3, Integer, silver_tests);

global differentTypes::((String ::= String) ::= Integer) = \ x::Integer -> \ x::String -> x;
equalityTest(differentTypes(1)("abcd"), "abcd", String, silver_tests);

-- Test triggers bug when parameter is a thunk and not a literal, as all the above were.
global param::Integer = 4;
equalityTest(addThree(param), 7, Integer, silver_tests);

-- These worked originally
equalityTest( (\x::Integer -> [x])(4), [4], [Integer], silver_tests);
equalityTest(map(\x::Integer -> x, [1,2,3]), [1,2,3], [Integer], silver_tests);
-- This one triggered the issue with 'context' being mutated to null by Thunk.
-- This resulted in another thunk believing it had already been evaluated (since
-- its context was null) and thus returning 'data' which was null, since no
-- evaluation had occurred.
equalityTest(head(map(\x::Integer -> [x], [4])), [4], [Integer], silver_tests);

