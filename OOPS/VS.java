/*Variable Shadowing
Sub class and Super class having static variable or non static variable with same name is known as variable shadowing.

Rules to achieve VS
-> Inheritance is mandatory.
-> Sub and Super class must have variables with same name.
*/

class P1{

int i=10;

}
class P2 extends P1{

int i=20;

}
class VS{
public static void main(String[] args){

P1 ref1=new P1(); //super class
System.out.println("i "+ref1.i);

P2 ref2=new P2(); //sub class
System.out.println("i "+ref2.i);

P1 ref3=new P2(); //upcasting
System.out.println("i "+ref3.i);

P2 ref4=(P2) ref3; //downcasting
System.out.println("i "+ref4.i);

}

}