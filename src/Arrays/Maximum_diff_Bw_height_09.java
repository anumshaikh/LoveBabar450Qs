package Arrays;

import java.util.Arrays;

public class Maximum_diff_Bw_height_09 {

    // BruteForce
    public static int findMinimumDiffBwHeight(int arr[]) {
        int diff = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) < diff)
                    diff = Math.abs(arr[i] - arr[j]);
            }
        }
        return diff;
    }

    // Effective method
    public static int findMinimumDiffBwHeight_Effective(int arr[]) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            if (Math.abs(arr[i + 1] - arr[i]) < diff)
                diff = Math.abs(arr[i + 1] - arr[i]);

        }
        return diff;
    }

    public static void main(String[] args) {
         int arr1[] = { 1, 5, 3, 19, 18, 25 };
        //int arr1[] = { 30, 5, 20, 9 };
        System.out.println(findMinimumDiffBwHeight_Effective(arr1));
    }
}
