
public class Array2D {
	
	//write a java program to calculate the sum of all the elements present-
	
	
	
	public static void main(String[] args) {
		int ar[][]= {{1,2},{3,4}};
		int sum=0;

		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				int a=ar[i][j];
				sum=sum+a;
				//System.out.println(ar[i][j]);
			}

			
		}
		System.out.println(sum);
	}

}


