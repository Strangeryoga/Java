//Reverse the number using for loop

public class ReverseNumber2{

public static void main(String[] args){

int n=123456, rev=0;

for(;n!=0;n=n/10){

int rem=n%10;
rev=rev*10+rem;

}

System.out.println("THe reverse of the given number is "+rev);


}


}