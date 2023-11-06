
//Also known as Sinking Sort/Exchange Sort
public class BubbleSort {
	public static void main(String[] args) {
		int ar[]= {43,89,2,12,9};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+i;j<ar.length;j++) {
				if(ar[j]<ar[i]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
	}

}
