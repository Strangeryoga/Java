
public class ArrayRotate {
	public static void AR1(int ar[]) {
		    int temp=0;	
			temp=ar[0];
			ar[0]=ar[ar.length-1];
			ar[ar.length-1]=temp;
	        for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
		
	}
	
	public static void AR2(int ar[]) {
		int num=1;//time rotate
		for(int a=0;a<ar.length;a++) {
			System.out.print(ar[a]+" ");
			System.out.println(" ");	
		}
		for(int i=0;i<num;i++) {
			//iterate	
			int last=ar[ar.length-1];
			for(int j=ar.length-1;j>0;j--) {
				//j 5
				ar[j]=ar[j-1];
			}
			ar[0]=last;
		}
		for(int s=0;s<ar.length;s++) {
			System.out.println();
			System.out.print(ar[s]);
		}
	}
	
	public static void AR3(int ar[]) {
		// 1,2,3,4,5
		int num=1;//time rotate
		for(int a=0;a<ar.length;a++) {
			System.out.println(ar[a]);
		}
		for(int i=0;i<num;i++) {
			int first=ar[0];
			for(int j=ar[ar.length-1];j<ar.length;j++) {
				ar[j]=ar[ar.length-2];
			}
			ar[ar.length-1]=first;
		}
		for(int s=0;s<ar.length;s++) {
			System.out.println(ar[s]);
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
//		AR1(ar);
//		AR2(ar);
		AR3(ar);
	}

}
