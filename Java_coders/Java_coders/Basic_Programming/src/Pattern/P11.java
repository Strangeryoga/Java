package Pattern;

//print the pattern in
// I
public class P11 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==n/2+1||i==5) {
				System.out.print("* ");
			}
				else {
					System.out.print("  ");
				}
		}
			System.out.println();

	}
	}

}
