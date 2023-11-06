
public class TwoMatrix {
public static void main(String[] args) {
	int ar[][]= {{1,2},{3,4}};
	int ar1[][]= {{3,2},{7,6}};
	int sum[][]=new int [2][2];
	for(int i=0; i<ar.length;i++) {
		for(int j=0;j<ar.length;j++) {
			 sum [i][j]=ar[i][j]+ar1[i][j];
			System.out.print(sum[i][j]);
			
		}
		System.out.println();	}
	
	
}
}
