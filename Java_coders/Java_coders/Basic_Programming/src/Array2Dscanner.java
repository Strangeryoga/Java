import java.util.Scanner;

public class Array2Dscanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows");
	int rows=sc.nextInt();
	System.out.println("Enter the colums");
	int col=sc.nextInt();
	int ar[][]=new int[rows][col];
	System.out.println("Enter the values");
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar[i].length;j++) {
			ar[i][j]=sc.nextInt();
		}
		
}
	System.out.println("Printing output");
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar[i].length;j++) {
			System.out.print(ar[i][j]);
			
		}
		System.out.println("");
}
	
}
}