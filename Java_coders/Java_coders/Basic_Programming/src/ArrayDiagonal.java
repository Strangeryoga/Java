
public class ArrayDiagonal {
	
	public static void main(String[] args) {
		
	//if(a==j){
		//S.O.P ar[i][j]
//		if(i+j==ar.length-1) { //2

	int ar[][]= {{2,3,4},{5,6,8},{-5,7,2}};
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar[i].length;j++) {
			if(i==j&&i+j==ar.length-1) { //2
				System.out.println(ar[i][j]);
			}
	}
		System.out.println("");
	}
}
}