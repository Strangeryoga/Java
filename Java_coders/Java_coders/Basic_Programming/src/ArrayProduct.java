
//write a java program to print the product of all the element present in the array
public class ArrayProduct {
	public static void main(String[] args) {
		int ar[][]= {{4,2},{7,2}};
		int pro=1;
		for(int i=0; i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				pro=pro*ar[i][j];
				
			}
		}
		System.out.println(pro);
	}

}
