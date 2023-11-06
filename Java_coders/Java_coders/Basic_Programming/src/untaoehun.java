


//WaJP to print the sum of all the even numbers present in an array


class B1{
	public static void P1() {
		int a[]= {32,89,00,11};
		int sum=0;
		System.out.println(a.length);
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	
	}
	
}


//Write a java program to reverse the array

class B2{
	public static void P2() {
		int a[]= {1,2,3,4,5,6};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);		
		
		}	
	}
}



//Write a java program to count the number of prime numbers present in a array


public class untaoehun {
	
	public static void P3() {
		int acount=0;
		int ar[]= {6,5,3,4,9,11};
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int n=1; i<=ar.length; i++) {
				if(ar[i]%n==0) {
					count++;
				}			
			}	
			if(count==2) {
				acount++;
				
				
			}
				
			}
//			System.out.println(ar[i]);
		}
	
	
	public static int factorial(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
		}
        return f;		

		}
	public static void main(String[] args) {
//		B1 ref=new B1();
//		ref.P1();
//		B2 ref=new B2();
//		ref.P2();
//		B3 ref=new B3();
//		ref.P3();
//		int ar[]= {6,5,3,4};
//		for(int i=0;i<ar.length;i++) {
//			System.out.println(factorial(ar[i] ));
//		}
		P3();


		
		
	

	
	}
	}
