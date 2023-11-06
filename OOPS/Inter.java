interface Tomato{
abstract public void login();
}

//implementing class
class Zomato implements Tomato{
public void login(){
System.out.println("Providing Method/Logic/Implementation");
}
}

class Inter{
public static void main(String [] args){
Tomato ref=new Zomato();  //upcasting
ref.login(); // overriding
}
}