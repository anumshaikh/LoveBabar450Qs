package Sorting;

public class MergeSort {

    public static void merge(int arr[], int low, int mid, int high) {
        int n = mid - low + 1;
        int m = high - mid;
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0;i<n;i++) {
            arr1[i] = arr[low+i];
        }
        for (int i =0;i<m;i++) {
            arr2[i] = arr[mid+i+1];
        }
        int k = low, i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j])
                arr[k++] = arr1[i++];
            else
                arr[k++] = arr2[j++];
        }
        while (i < n) {
            arr[k++] = arr1[i++];
        }
        while (j < m) {
            arr[k++] = arr2[j++];
        }
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 10, 5, 2, 9, 1, 8, 3, 7, 6 };
        System.out.println("Before Sorting");
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
        sort(arr, 0, arr.length - 1);
        for (int a : arr)
            System.out.print(a + " ");
    }
}
