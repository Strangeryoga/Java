import java.util.Random;

//Using the Random Class
//to generate a random number is to use the Java Random class of the java.util package. It //generates a stream of pseudorandom numbers. We can generate a random number of any data //type, such as integer, float, double, Boolean, long


public class RandomNumber2{
public static void main(String args[]){

//creating an object of Random class
Random random=new Random();

//generates random integer from 0 to 100
int x=random.nextInt(100);

//generates random double values
double y=random.nextDouble();

System.out.println(x);
System.out.println(y);



}


}