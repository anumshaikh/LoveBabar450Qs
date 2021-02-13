package Arrays;

public class Sort_PosNo_NegNo {
    static void dutchFlagApproach(int arr[]) {

        int low = 0, mid = 0, high = arr.length - 1, temp = 0;
        while (low <= high) {
            if (arr[mid] < 0) {
                // positive number
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
    }

    static void quicksortApproach(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }

    static void twoFlagApproach(int arr[]) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[low] < 0 && arr[high] < 0) {
                low++;
            }
            // Condition to check if the left
            // pointer element is positive and
            // the right pointer element is negative
            else if (arr[low] >= 0 && arr[high] < 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
            // Condition to check if both the
            // elements are positive
            else if (arr[low] >= 0 && arr[high] >= 0) {
                high--;
            } else {
                low++;
                high--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, 1, -4, 2, -7, -3, 9, 8, -6 };
        dutchFlagApproach(arr);
        System.out.println("\n Sorting array through Dutch National Flag \n ");
        for (int a : arr)
            System.out.print(" " + a);

        // Using Quick Sort Approach
        int arr1[] = { 0, -1, 1, -4, 2, -7, -3, 9, 8, -6 };
        quicksortApproach(arr1);
        System.out.println("\n Sorting array through Quick Sort Approach \n ");
        for (int a : arr1)
            System.out.print(" " + a);

        // Using 2 flag / pointer
        int arr2[] = { 0, -1, 1, -4, 2, -7, -3, 9, 8, -6 };
        twoFlagApproach(arr2);
        System.out.println("\n Sorting array through 2 Flag Approach \n ");
        for (int a : arr2)
            System.out.print(" " + a);

    }
}
