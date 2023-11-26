import java.util.Arrays;
// https://static.javatpoint.com/corebasic/programs/images/selectionsort.jpg

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,9,3,1,2,6,8,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]) {
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int fir, int sec) {
        int temp = arr[fir];
        arr[fir] = arr[sec];
        arr[sec] = temp;

    }
}
