class Armstrong{
public static int count(int n){
int count=0;
int countOfDigit=count;
int f=1;
int sum=0;
while(n!=0){
int d=n%10;
for(int i=1;i<=countOfDigit;i++){

f=f*d;
sum=sum+f;

}
count++;
n=n/10;



}
return count;


}

public static void main(String args[]){

int n=371;
System.out.println(count(n));

}



}