
public class Duplicate {
	public static void main(String[] args) {
		int ar[] ={6,1,4,2,5,3,1,6};
			for(int i=0;i<ar.length;i++) {
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						System.out.println(ar[i]);
					}
				}
			}
//		for(int i:ar) {
//			System.out.println(i);
//		}
	}

}
