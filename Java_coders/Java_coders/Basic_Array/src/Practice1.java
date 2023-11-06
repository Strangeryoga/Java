
public class Practice1 {
	public static void main(String[] args) {
		int ar[]= {9,3,2,5,1};
		for(int i=1;i<ar.length;i++) {
			int temp=ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>temp) {
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=temp;
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
