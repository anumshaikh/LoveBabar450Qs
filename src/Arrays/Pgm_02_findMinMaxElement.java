package Arrays;

class Pair {
    int min, max;
}

public class Pgm_02_findMinMaxElement {

    // Brute force approach, navigate entire array T.c. = o(n)
    // Approach 2 Tournament Approach

    public static Pair getMinMaxTournament(int arr[], int start, int end) {
        Pair pair = new Pair();
        if (start == end) {
            pair.min = pair.max = arr[start];
            return pair;
        }
        if (start == end - 1) {
            pair.max = arr[start] > arr[end] ? arr[start] : arr[end];
            pair.min = arr[start] < arr[end] ? arr[start] : arr[end];
            return pair;
        }

        Pair pairl = new Pair();
        Pair pairR = new Pair();
        int mid = (start + end) / 2;
        pairl = getMinMaxTournament(arr, start, mid);
        pairR = getMinMaxTournament(arr, mid + 1, end);

        pair.max = pairl.max > pairR.max ? pairl.max : pairR.max;
        pair.min = pairl.min < pairR.min ? pairl.min : pairR.min;

        return pair;

    }

    public static Pair getMinMaxByCheckinPair(int arr[],int start,int end){
        Pair pair = new Pair();
        int n=arr.length,i=0;
        if(n%2==0){
            // Even case to initalize min max use first 2 element 
            pair.max = arr[0] > arr[1] ? arr[0] : arr[1];
            pair.min = arr[0] < arr[1] ? arr[0] : arr[1];
            i=2;
        }
        else{
            //Odd case to initalize min max use first element
            pair.min = pair.max = arr[0];
            i=1;
        }
        //For Remaining elements
        while(i<n){
            int currentmax = arr[i]>arr[i+1] ? arr[i] : arr[i+1];
            pair.max = currentmax>pair.max ? currentmax : pair.max;

            int currentmin = arr[i] < arr[i + 1] ? arr[i] : arr[i + 1];
            pair.min = currentmin < pair.min? currentmin : pair.min;
            i=i+2;

        }
    
        return pair;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 60, -100, 1, 55, 10, 9, 8, 7, -1 };
        Pair pair = new Pair();
       // pair = getMinMaxTournament(arr, 0, arr.length - 1);
       pair = getMinMaxByCheckinPair(arr, 0, arr.length - 1);
        System.out.println("Max="+pair.max+"\t Min="+pair.min);
    }

}
