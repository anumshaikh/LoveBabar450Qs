package Strings;

public class Pgm_02_PalindromeCheck {

    public static boolean PalindromeCheck(String text, int start, int end) {
        if (start == end)
            return true;
        else if (text.charAt(start) != text.charAt(end))
            return false;
        if (start < end + 1)
            PalindromeCheck(text, start + 1, end - 1);
        return true;

    }

    public static void main(String[] args) {

        String text = "malayalam";
        String reverseText = Pgm_01_Reverse.reverse_BySwap(text);
        if (text.equals(reverseText))
            System.out.println(text + " Its a Palindrome");
        else
            System.out.println(text + " Its not a Palindrome");

        System.out.println("Approach 2 "+PalindromeCheck(text, 0, text.length()-1));
    }

}
