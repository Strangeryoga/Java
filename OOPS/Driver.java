/*Inheritance with respect to static members

Always super class will be loaded first
Once the loading process of super class is completed then loading
process of sub class will become. */


class P1{
static{
System.out.println("SIB- super class");
}
}


class P2 extends P1{
static int i=15;  //static variable
static{
System.out.println("SIB- sub class");
}
}

class Driver{
public static void main(String [] args){

P2 ref=new P2(); //sub class
System.out.println(ref.i);

}


}

