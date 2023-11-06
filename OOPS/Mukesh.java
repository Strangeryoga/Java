class Dhirubhai{
String company="Reliance Inds"; //states
public void thinkingStyle(){
System.out.println("Dhirubhai's unique thinking style");
}




}

class Mukesh extends Dhirubhai{
public static void main(String [] args){
Mukesh m=new Mukesh();
System.out.println("Company "+m.company);
m.thinkingStyle();


}


}