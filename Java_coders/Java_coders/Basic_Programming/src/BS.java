import java.util.Scanner;

public class BS{
	
	public static void BS1() {
		char []a= {'h','h','h','h'};
		System.out.println("add" +a);
	}
	
	
	


	
	
	
	
	public static void main(String[] args) {
//		int [] a= {10,21,30,45,55};
//		System.out.println(a);
//		for (int i: a ) {
//			System.out.println(i);
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println("length of the array is "+a.length);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];	
//		}
//		System.out.println(sum);
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0) {
//				System.out.println(a[i]);
//				
//			}
//		}		
//		BS ref=new BS();
//		ref.BS1();
		
//		int ar[] =new int[3];
//		ar[0]=53;
//		ar[1]=43;
//		ar[2]=87;
//		
//		
//		
//		int sum=0;
//		
//		for(int i=0; i<ar.length;i++) {
//			sum=sum+ar[i];
//		}
//		System.out.println(sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		
		System.out.println("Enter the values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			
			
		}
		
		System.out.println();
		System.out.println("Values in the array is");
		System.out.println("By using for loop");
		int pro=1;
		int fact=1;
		for(int i=1;i<ar.length;i++) {
			pro=pro*ar[i];
			System.out.println(ar[i]);
		}
		System.out.println("product of the array is "+pro);
		System.out.println("By using for each loop");
		for(int i:ar) {
			System.out.println(i);
		}
		
		
		//Write a java program to calculate the product of all the elements present in an array
		//WAJP to calculate the factorial of each element present in an array 
		//WAJP to calculate the count of factors of each element present in an array 
		//WAJP to find the largest element present in an array
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}