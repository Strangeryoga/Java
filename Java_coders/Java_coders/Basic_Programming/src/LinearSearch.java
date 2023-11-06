
public class LinearSearch {
	
//	public static void ArrayRotate(int ar[]) {
//		int temp=0;
//		
//		temp=ar[0];
//		ar[0]=ar[ar.length-1];
//		ar[ar.length-1]=temp;
//        for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i]+" ");
//		}
//		
//
//		
//	}

	
	public static void main(String[] args) {
		int ar[]= {6,2,4,1,3,5};
		for(int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println("");
		int search=6;
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==search) {
				System.out.println(i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not present");
		}
//		ArrayRotate(ar);
		
	}
}
