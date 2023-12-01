import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subset(arr);
//        System.out.println(ans);  // [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        List<List<Integer>> ans1 = subsetDuplicate(arr);
        System.out.println(ans1);
    }

    // Iterative program to print subseq without using recursion
    static List<List<Integer>> subset(int[] arr) {
        // Initialize an outer list to store all subsets
        List<List<Integer>> outer = new ArrayList<>();
        // Add an empty list to represent the empty subset
        outer.add(new ArrayList<>());
        // Iterate through each element in the array
        for (int num : arr) {
            int n = outer.size();
            // Iterate through each existing subset in the outer list
            for (int i = 0; i < n; i++) {
                // Create a new list by copying the current subset
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // Add the current array element to the new subset
                internal.add(num);
                // Add the new subset to the outer list
                outer.add(internal);
            }
        }
        // Return the list containing all generated subsets
        return outer;
    }

    // array consist of duplicate
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;

            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n  = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);

            }
        }
        return outer;
    }

}
