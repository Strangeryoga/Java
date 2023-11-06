class Father{

String house="Big flat";
String vehicle="bike";

public void look(){
System.out.println("Look : Similar");
}

public void speakingStyle(){
System.out.println("Speaking style: Same");
}

public void thinkingStyle(){
System.out.println("Thinking style: Different from others");
}
}

class Son extends Father{
String bike="Passion";

public void passion(){
System.out.println("My Passion : fix");
}
}


class Stranger{
public static void main(String [] args){
Son ref=new Son();
System.out.println("My property: "+ref.house);
System.out.println("My vehicle: "+ref.vehicle);
ref.look();
ref.speakingStyle();
ref.thinkingStyle();


}




}