import java.util.Scanner;

//WAJP to calculate the factorial of each element present in an array 

public class Z1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int size=sc.nextInt();
	
	int ar[]=new int[size];
	System.out.println("Enter the value in array: ");
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	for(int j=0;j<ar.length;j++) {
		int fact=1;
		int count=0;
		for(int k=ar[j];k>=1;k--) {
			fact =fact*k;
			count++;
		}
		System.out.println("Factorial of "+ ar[j] +" is "+fact);
		System.out.println(count);
	}
}
}
