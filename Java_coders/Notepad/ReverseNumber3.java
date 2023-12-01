import java.util.Scanner;

//Reverse the number using recursion
public class ReverseNumber3{

//method for reverse a number
public static void reverseNumber(int n){
if(n<10){
//print that same no.
System.out.println(n);
}else{
System.out.print(n%10);
reverseNumber(n/10);
}
}
public static void main(String args[]){
System.out.print("Enter the number to reverse ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.print("the reverse of the given no. is ");

//method calling
reverseNumber(num);


}


}

