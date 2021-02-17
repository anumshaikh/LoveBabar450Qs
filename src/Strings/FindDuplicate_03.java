package Strings;

public class FindDuplicate_03 {
    static int count[]=new int[256];
    //Approach 1  , TC : o(N) , SC : O(256)
    //Appraoch 2 , Using maps , TC()
    public  static void duplicateCheck(String text){
        for(int i=0;i<text.length()-1;i++){
            count[text.charAt(i)]++;
        }
        System.out.println("Print all Duplicate chars");
        for(int i=0;i<255;i++){
            if(count[i] >1) System.out.print(" "+(char)i);
        }
    }
    public static void main(String[] args) {
        String text = "AABCREPQTBUCEZ";
        duplicateCheck(text);

    }
}
