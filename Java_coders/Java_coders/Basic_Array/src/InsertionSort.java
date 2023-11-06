
public class InsertionSort {
	
	public static void main(String[] args) {
		//insertion
		//         0 1 2 3 4 5 6
		int ar[]= {8,3,9,2,1,4,5}; //i=1 j=i-1
		//         j  i
		for(int i=1;i<ar.length;i++) {
			//i=1
			int temp=ar[i]; //1
			int j=i-1; //0 -1
			while(j>=0&&ar[j]>temp) {
				//  t      8 > 3
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=temp;
			//a[0]=1
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
	}

}
