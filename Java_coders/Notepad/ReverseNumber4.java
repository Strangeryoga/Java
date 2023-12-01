import java.util.*;
//Reverse the positive number as well as negative number

/*The following program reverses both numbers, positive and negative. When we enter a number, //it first checks the number is positive or negative. If the number is negative, it converts //the number into positive by multiplying -1. After that, it performs the same steps (as we //have performed in the above programs) to reverse a number. At last, again it checks the //number is negative or positive. To make the number negative, it again multiplies the reverse //number by -1.*/


public class ReverseNumber4{
public static void main(String args[]){
System.out.println("Enter the number you want to reverse ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rev_num=reverseNumber(n);
System.out.println("The reverse of the number is "+rev_num);
}

//method to reverse the number
public static int reverseNumber(int n){
boolean isNoNegative=n<0?true:false;
if(isNoNegative){

n=n*-1;  //make the no. positive if the given no is negative

}
int rev=0;
int lastDigit=0;
while(n>=1){

lastDigit=n%10; //gives the last digit no.

rev=rev*10+lastDigit;
n=n/10;  //removes the last digit of no.

}
//make the no. neg again
return isNoNegative==true?rev*-1:rev;

}


}