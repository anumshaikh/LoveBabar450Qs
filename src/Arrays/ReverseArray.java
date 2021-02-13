package Arrays;

public class ReverseArray {

    // This function will print in O(N) time
    public static int[] reverse(int arr[]) {
        int newarr[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--)
            newarr[j++] = arr[i];
        return newarr;
    }

    public static int[] reverseMiddle(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        arr = reverseMiddle(arr);
        // arr=reverse(arr);
        for (int a : arr)
            System.out.print(a + " ");
    }
}
