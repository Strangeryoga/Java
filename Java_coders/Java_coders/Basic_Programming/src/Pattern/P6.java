package Pattern;

//Print pattern in
//A
//A B
//A B C
public class P6 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';

			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(ch++);
	
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

}
