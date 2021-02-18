package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to find Union and intersection of 2 Sorted Arrays
public class UnionIntersectSortedArray {

    // Find Union

    public static int findUnionforSortedEle(int arr1[], int arr2[]) {

        List<Integer> list = new ArrayList<Integer>();
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else {
                list.add(arr2[j]);
                j++;
            }
        }
        while (i < m) {
            list.add(arr1[i]);
            i++;
        }
        while (j < n) {
            list.add(arr2[j]);
            j++;
        }
        System.out.println("Union " + list);
        return list.size();
    }

    // Find intersection
    public static int findIntersectionforSortedEle(int arr1[], int arr2[]) {

        List<Integer> list = new ArrayList<Integer>();
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
       
        System.out.println("Intersection " + list);
        return list.size();
    }

    public static void main(String[] args) {
        // int arr1[] = { 1, 2, 3, 4, 5 };
        // int arr2[] = { 1, 2, 3 };
        int arr1[] = { 6, 2 };
        int arr2[] = { 85, 25, 1, 32, 54, 6 };
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(findUnionforSortedEle(arr1, arr2));
        System.out.println(findIntersectionforSortedEle(arr1, arr2));
        // TC : O(mlogm+nlogn)
    }

}
