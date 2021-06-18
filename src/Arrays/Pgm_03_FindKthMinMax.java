package Arrays;

import DataStructure.MinHeap;
import Sorting.MergeSort;

public class Pgm_03_FindKthMinMax {

    public static void main(String[] args) {
        int arr[] = { 100, 60, 40, 1, 55, 10, 9, 8, 7, -1 };
        int ele = -1, k = 4;

        // Merge Sort Time complexity is o(n logn)
        MergeSort.sort(arr, 0, arr.length - 1);
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println("\n Using merge sort, " + k + "th min " + arr[k - 1] + " max " + arr[arr.length - k]);

        // Using Min Heap
        // k smallest element & largest element, k=4

        MinHeap minHeap = new MinHeap();
        for (int a : arr)
            minHeap.add(a);


        System.out.println(minHeap);

        // poll k times to get k min element
        int smallele = -1;
        for (int i = 0; i < k; i++)
            smallele = minHeap.poll();
        System.out.println("Heap Size "+minHeap.size);
        for (int i = 0; i < minHeap.size; i++)
         {
             ele = minHeap.poll();
           //  System.out.print(" i "+i+" removed "+ele+" ");
         }  

        System.out.println("Using Min Heap, " + k + " smallest " + smallele + " largest " + ele);

    }
}
