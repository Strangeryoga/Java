/* Inheritance with respect to non static members

Always super clas non static members will be loaded into sub class object with the help of constructor chaining
by using super(); */

class P1{
int i=25;
{
System.out.println("IIB super class");
}
}

class P2 extends P1{
{
System.out.println("IIB sub class");
}
}

class Driver1{
public static void main(String [] args){
P2 ref=new P2();
System.out.println("i: "+ref.i);

}

}