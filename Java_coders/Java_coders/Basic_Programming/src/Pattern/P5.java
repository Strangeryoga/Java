package Pattern;

import java.util.Scanner;

//print the pattern in + in generic form
public class P5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==n/2+1||j==n/2+1) {
				System.out.print("*"+" ");
			}
				
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
