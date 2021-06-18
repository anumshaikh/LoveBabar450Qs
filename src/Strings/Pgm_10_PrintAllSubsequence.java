package Strings;

import java.util.ArrayList;
import java.util.List;

public class Pgm_10_PrintAllSubsequence {
    static List<String> list = new ArrayList<String>();

    public static void addSubsequenceList(String text, String ans) {

        if (text.length() == 0 ) {
            list.add(ans);
            System.out.println("Inside "+ans);
            return;
        }
        addSubsequenceList(text.substring(1), ans + text.charAt(0));
        addSubsequenceList(text.substring(1), ans);
    }

    public static void main(String[] args) {
        String text = "abc";
        addSubsequenceList(text, "");
        System.out.println(list);
    }

}
