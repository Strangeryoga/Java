package Pattern;

//print the pattern 
//A
public class P13 {
	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1&&i>=n/2+1||i==n/2+1||j==n&&i>=n/2+1||i+j==n/2+2||j-i==n/2) {
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
