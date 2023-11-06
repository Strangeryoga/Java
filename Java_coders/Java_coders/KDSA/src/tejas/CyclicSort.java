package tejas;

import java.util.Arrays;

public class CyclicSort {
	
	
	static void sort(int arr[]) {
		int i=0;
		while(i< arr.length) {
			int correct=arr.length-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
	}
	
	 static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		 
		 int temp=arr[first];
		 arr[first]=arr[second];
		 arr[second]=temp;
		
	}

	public static void main(String[] args) {
		int arr[]= {3,5,4,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("hello world");
	}

}
