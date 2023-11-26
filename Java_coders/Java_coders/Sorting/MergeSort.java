import java.util.Arrays;
// https://media.geeksforgeeks.org/wp-content/uploads/20230706153706/Merge-Sort-Algorithm-(1).png

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] all = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                all[k] = arr[i];
                i++;
            } else {
                all[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may possible that one of the array is not complete
        // copy the remaining elements
        while (i < mid) {
            all[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            all[k] = arr[j];
            j++;
            k++;
        }

        for (int a = 0; a < all.length; a++) {
            arr[s+a] = all[a];
        }
    }


    // this will not modified the array but it will create a copy and this will take extra space
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}