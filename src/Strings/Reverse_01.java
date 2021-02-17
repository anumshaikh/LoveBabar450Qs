package Strings;

public class Reverse_01 {

    public static String reverse_bruteforce(String reverse){
        String newString="";
        for(int i=reverse.length()-1;i>=0;i--){
            newString+=reverse.charAt(i)+"";
        }
        return newString;
    }

    public static String reverse_BySwap(String text){
       char arr[]=text.toCharArray();
       int low=0,high=text.length()-1;
       while(low<high){
           char temp=arr[low];
           arr[low]=arr[high];
           arr[high]=temp;
           low++;
           high--;
       }
       
        return toString(arr);
    }

    public static String toString(char  arr[]){
        String text="";
        for(int i=0;i<arr.length;i++)
            text+=arr[i]+"";

            return text;
        
    }

    public static void main(String[] args) {
        String text="versova";
        System.out.println("By brute force-> "+reverse_bruteforce(text));
        System.out.println("By SWap-> "+reverse_BySwap(text));
    }
    
}
