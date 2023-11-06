
public class SeclectionSort {
	public static void SelectionSort(int ar[]) {
		int min;	
		for(int i=0;i<ar.length;i++) {
			min=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min]) {
					min=j;					
				}
			}
			int temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;	 	
	}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
	}
	
	public static void BubbleSort(int ar[]) {
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
	
	
	
	public static void main(String[] args) {

		int ar[]= {15,7,1,11};
		System.out.println("Selection Sort");
		SelectionSort(ar);
		System.out.println("Bubble Sort");
		BubbleSort(ar);
		
		
		
	}
}
