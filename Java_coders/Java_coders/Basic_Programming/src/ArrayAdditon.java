
public class ArrayAdditon {
	public static void main(String[] args) {
		int ar[][]= {{2,4},{1,3},{7,9}};
		for(int i=0;i<ar.length;i++) {
			int add=0;
			for(int j=0;j<ar[i].length;j++) {
				add=add+ar[i][j];
				
		}
			System.out.println("addition of "+i+" 1-D is "+add);
		
	}

}
}