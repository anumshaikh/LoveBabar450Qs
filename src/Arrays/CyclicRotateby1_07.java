package Arrays;

public class CyclicRotateby1_07 {

    public static void cyclicLeftRotatearray(int arr[]) {
        int firstele = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstele;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        cyclicLeftRotatearray(arr1);

        for (int x : arr1)
            System.out.print(x + " ");

        // TC : O(n) , SC : O(1)

    }
}
