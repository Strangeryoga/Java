/* Method Shadowing

Sub class and Super class having static method with same name and same FA(Formal Argument) is known as Method Shadowing.

Note:
Which method to be called is decided by Compiler during Compile Time based on reference variable type but not based on Object creation

Rules to achieve Method Shadowing
-> Inheritance is mandatory
-> Sub class and Super class must have method with same name
-> FA should be same
-> return type should be same
-> Access specifier should be same
-> Method should be same

*/

class P1{
public static void sheela(){

System.out.println("Sheela from super ac class");
}

}
class P2 extends P1{

public static void sheela(){

System.out.println("Sheela from sub sleeper class");

}

}
class MS{
public static void main(String[] args){

P1 ref=new P1();  //super class
ref.sheela();

P2 ref1=new P2();   //sub class
ref1.sheela();

P1 ref2=new P2();  //upcasting
ref2.sheela();

P2 ref3=(P2) ref2;  //downcasting
ref3.sheela();
}


}