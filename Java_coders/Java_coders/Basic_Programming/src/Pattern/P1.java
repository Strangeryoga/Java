package Pattern;

//print star in  box shape

//********
//*      *
//*      *
//*      *        
//********
public class P1 {
	public static void main(String[] args) {
		
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row==1||row==5||col==1||col==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
//				if(col==1||col==5) {
//					System.out.println("*");
//				}
				
			}
			System.out.println();
		}
	}

}
