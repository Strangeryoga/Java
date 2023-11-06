package Pattern;


// print star in X shape
public class P3 {
	public static void main(String[] args) {
		
	
	int n=5;
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row+col==6||row==col) {
				System.out.print("*"+" ");
			}
				
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}}
