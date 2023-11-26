import java.util.Arrays;
// https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png

public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        sort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));

        // inbuilt sorting
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pvt = nums[m];

        while (s <= e) {

            // in merge sort it will sort untill last but in quick sort it's not the case
            while (nums[s] < pvt) {
                s++;
            }
            while (nums[e] > pvt) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // pivot is in the correct index, now it will sort other two halves
        sort(nums, low ,e);
        sort(nums, s, high);
    }
}