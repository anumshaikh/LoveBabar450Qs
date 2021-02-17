package Strings;

public class RotationOfAnotherString_05 {
    public static boolean checkRotationOfAnotherString(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        String newS = s1 + s1;
        return newS.contains(s2);
    }

    public static void main(String[] args) {
       String s1="ABACD",s2="CDABA";
       //String s1 = "ABCD", s2 = "ACBD";

    System.out.println(checkRotationOfAnotherString(s1,s2));
    }
}
