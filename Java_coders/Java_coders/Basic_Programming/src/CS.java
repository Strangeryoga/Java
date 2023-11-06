import java.util.Scanner;

public class CS {
	public static void  CS() {
		int f=1;
	
		for(int i=1;i<=5;i++) {
			
		
		for(int n=i;n<=i;n++) {
			f=f*n;
		}
		System.out.println(f);
		}
	}
	
	public static void P6() {
		System.out.println("Enter your number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
			System.out.println("Factorial of "+i+" is " +f);

		}

	}
	
	public static void P2() {
		int a=40;
		int b=22;
		System.out.println("before swap");
		System.out.println(a);
		System.out.println(b);
		System.out.println("after swap");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void P3() {
		//print factors of a number
		int a=9;
		int count=0;
		for(int i=1;i<a;i++) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Factors of a number are");
		System.out.println(count);

		
	}
	public static void main(String[] args) {
		CS ref=new CS();
		ref.P3();
		
	}

}
