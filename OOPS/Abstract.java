abstract class Tomato{
abstract public void login();
}

class Zomato extends Tomato{
public void login(){
System.out.println("Method body/logic/implementation");
}
}

class Abstract{
public static void main(String [] args){
Tomato ref=new Zomato();
ref.login();
}
}