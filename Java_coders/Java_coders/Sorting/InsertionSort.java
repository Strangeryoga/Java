import java.util.Arrays;
// https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,9,3,1,2,6,8,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i< arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int fir, int sec) {
        int temp = arr[fir];
        arr[fir] = arr[sec];
        arr[sec] = temp;

    }
}
