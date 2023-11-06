import java.util.Scanner;


//Bubble Sort
public class Practice {
	
	public static void printArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("smallest element in the array "+ar[0]);
		System.out.println("largest element in the array "+ar[ar.length-1]);
	}
	
	//Write the java program to print the smallest element present in an array
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
			for(int i=0;i<ar.length;i++) {
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]>ar[j]) {
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					
				
			}
				
					
					
				}
			
		
			}
		printArray(ar);

	

}
	}


	
	//Write the java program to print the smallest element present in an array















