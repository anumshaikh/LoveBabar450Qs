package Strings;

public class Pgm_09_LongestRecurrence {
    static int max(int a,int b){
        return a>b?a:b;
    }
    static int findLongestRepeatedSubsequence(String text) {
     
        int n = text.length();
        int arr[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
          arr[i][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(text.charAt(i-1) == text.charAt(j-1) && (i!=j)){
                    arr[i][j]=1+ arr[i-1][j-1];
                }
                else
                    {
                        arr[i][j]=max(arr[i][j-1],arr[i-1][j]);
                    }
            }  
    }
    return arr[n][n];
}

    public static void main(String[] args) {
       // String text="AAYFYCSS";
        String text="aabb";
        System.out.println("Length of largest repeated subsequence "+findLongestRepeatedSubsequence(text));
    }
}
