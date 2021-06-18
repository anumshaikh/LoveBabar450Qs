package Arrays;

public class Pgm_08_LargestSum_Kadanes {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int FindLargestSumContigous(int arr[]){
        int n=arr.length,max=arr[0];
        int sum[]=new int[arr.length];
        if(n==0) return 0;
        sum[0]=arr[0];
        for(int i=1;i<n;i++){
            sum[i] = max(sum[i-1]+arr[i],arr[i]); 
            max= max>sum[i]?max:sum[i];

        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println( FindLargestSumContigous(arr));
       //TC : O(n)
    }
}
