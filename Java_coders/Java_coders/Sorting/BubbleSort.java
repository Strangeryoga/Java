import java.util.Arrays;
// https://media.geeksforgeeks.org/wp-content/uploads/20230526103842/1.webp
// https://media.geeksforgeeks.org/wp-content/uploads/20230526103914/2.webp
// https://media.geeksforgeeks.org/wp-content/uploads/20230526103914/2.webp

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,7,9,3,1,2,6,8,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // loop will run in n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // this will give maximum element in the last
            for (int j= 1; j < arr.length; j++) {
                // swap the smaller item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if the array is sorted
            if (!swapped) {  // !false = true
                break;
            }
        }
    }
}
