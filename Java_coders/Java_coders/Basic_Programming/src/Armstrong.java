import java.util.Scanner;

//Q40 ->write a java program to print all the armstrong numbers in the range by using method

public class Armstrong {
	
	public static int count(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int temp=n;
		int countOfDigit=count(n);
		int sum=0;
		while(n!=0) {
			int d=n%10;
			int f=1;
			for(int i=1;i<=countOfDigit;i++) {
				f=f*d;
				
			}
			sum=sum+f;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong no"+temp);
		}
		else {
			System.out.println("not armstrong no"+temp);
		}
	}
}
