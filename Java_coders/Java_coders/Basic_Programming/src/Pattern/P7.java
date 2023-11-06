package Pattern;


//print pattern in
//1
//1 0
//1 0 1
//1 0 1 0
public class P7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
				System.out.print(j%2);
			}
				else {
					System.out.print(" ");
				}
		}
			System.out.println();

	}

}
}