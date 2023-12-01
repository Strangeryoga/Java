//Generating random number int the range


public class RandomNumber{
public static void main(String args[]){
int min=200;
int max=300;

//Generate random double value from 200 to 400
System.out.println("Random value of type double is");

double a=Math.random()*(max-min+1)+min;
System.out.println(a);

//Generate random int value from 200 to 400
System.out.println("Random value of type int is");

int b=(int)(Math.random()*(max-min+1)+min);
System.out.println(b);
System.out.println(Math.random());
}
}