
public class ArraySum {
public static void main(String[] args) {
	int ar[][]= {{2,3,4},{5,6,8},{-5,7,2}};
	int sum=0;

	for(int a=0;a<ar.length;a++) {

		for(int j=0;j<ar[a].length;j++) {
			if(a==j) {
//			System.out.print(ar[a][j]);
			sum=sum+ar[a][j];
		}

	}
//		System.out.println("");
	}
	System.out.println(sum);

}
}
