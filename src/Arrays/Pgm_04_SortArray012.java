package Arrays;

public class Pgm_04_SortArray012 {

    public static void countapproch(int arr[]) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int a : arr) {
            if (a == 0)
                count0++;
            else if (a == 1)
                count1++;
            else
                count2++;
        }

        int i = 0;
        while (i < count0)
            arr[i++] = 0;
        while (i < count0 + count1)
            arr[i++] = 1;
        while (i < count0 + count1 + count2)
            arr[i++] = 2;

    }

    static void swap(int arr[], int i1, int i2) {
        int temp = arr[i1];
        arr[i2] = arr[i1];
        arr[i1] = temp;
    }

    static void ductchNationalFlag(int arr[]) {
        System.out.println("Dutch Array \n ");
        for (int a : arr)
            System.out.print(" " + a);

        int low = 0, mid = 0, high = arr.length - 1, temp = 0;
        while (mid <= high) {

            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0, 2, 1, 0, 1, 1, 2 };

        countapproch(arr);
        System.out.println("Sorting array through counting \n ");
        for (int a : arr)
            System.out.print(" " + a);

        int arr1[] = { 0, 2, 1, 0, 2, 1, 0, 1, 1, 2 };
        ductchNationalFlag(arr1);
        System.out.println("\n Sorting array through Dutch National Flag \n ");
        for (int a : arr1)
            System.out.print(" " + a);

    }

}
