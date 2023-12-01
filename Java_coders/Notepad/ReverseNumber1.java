//Reverse a string using while loop

public class ReverseNumber1{

public static void main(String[] args){

int n=1234,reverse=0;

while(n!=0){
int rem=n%10;  //1234%10=4
reverse=reverse*10+rem;  //0*10+4=4
n=n/10;   //1234/10=123;
}

System.out.println("The reverse of the given number is: "+reverse);
}


}
