/*
Method Overloading
Class can have more than one method with same name but different FA(Formal Argument) either differ in length or differ in datatype.

Rules to called parameterized method
-> The length of actual argument and Formal argument should be same.
-> The corresponding datatype of actual argument and formal argument should be same.
-> If same datatype is not available then compiler will try to do widening.
-> Suppose widening is not possible then we get error.

test('c')<---- char

char --> int --> long --> float --> double error
  x       x        x        x          x

*/

public class MO {
  
    public static int foo(int a) { return 10; }
    public static char foo(int a, int b)   { return 'a'; }
  
    public static void main(String args[])
    {
        System.out.println(foo(1));
        System.out.println(foo(1, 2));
    }
}