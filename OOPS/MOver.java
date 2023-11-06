/*
Method Overriding

Sub class non static method will over ride super class non static method.

Sub class and super class having non static method with same name and same FA.

Rules to achieve MO
-> Method name is same
-> FA is same
-> return type is same
-> Access specifier is same
-> Inheritance is mandatory
-> MO is only over non static method

*/

class P1{
public void sheela(){
System.out.println("sheela super");
}
}

class P2 extends P1{
public void sheela(){
System.out.println("sheela sub");
}
}

class MOver{
public static void main(String [] args){
P1 ref=new P1();  //super class
ref.sheela();
P2 ref1=new P2();  //sub class
ref1.sheela();
P1 ref2=new P2();   //upcasting
ref2.sheela();
}
}













