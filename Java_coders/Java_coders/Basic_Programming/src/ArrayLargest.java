
public class ArrayLargest {
public static void main(String[] args) {
	int ar[][]= {{2,3,4},{5,6,8},{-5,7,2}};

	for(int i=0;i<ar.length; i++) {
		  int temp=ar[i][0];
		for(int j = 1; j<ar[i].length; j++) {
			if(ar[i][j]>temp) {
				temp=ar[i][j];
			}
		   
		}
		 System.out.println(temp);
	}
}
}
