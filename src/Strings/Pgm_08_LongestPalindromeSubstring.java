package Strings;

public class Pgm_08_LongestPalindromeSubstring {

    public static String findLongestPalindromeSubString(String text) {

        int n = text.length();
        int maxlength = 1, start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int flag = 1;
                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (text.charAt(i + k) != text.charAt(j - k))
                        flag = 0;
                    //System.out.println("String under consideration " + text.substring(i, j));
                }

                if (flag != 0 && (j - i + 1) > maxlength) {
                    maxlength = j - i + 1;
                    start = i;
                }

            }
        }
        System.out.println("Start " + start + " Maxlength " + maxlength);
        return text.substring(start, start + maxlength);
    }

    public static String findLongestPalindromeSubString_DP(String text) {

        int n = text.length();
        int arr[][] = new int[n][n];
        int maxlength = 1, start = 0;
        // for maxlength=1, all is palindrome
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }

        // for maxlength 2, check if both char are equals
        for (int i = 0; i < n - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                arr[i][i + 1] = 1;
                maxlength = 2;
                start = i;
            }
        }

        // for maxlength 3 onwards, check with for loop for

        for (int k = 3; k <= n; k++) {

            // fix starting index, n-k+1 = > to not iterate loop where maxlength is not
            // acheived or eod string
            for (int i = 0; i < n - k + 1; i++) {
                // get ending index starting from i with maxlength
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (text.charAt(i) == text.charAt(j) && (arr[i + 1][j - 1] == 1)) {
                    arr[i][j] = 1;
                    if (k > maxlength) {
                        start = i;
                        maxlength = k;
                    }
                }

            }
        }
        return text.substring(start, start + maxlength);

    }

    public static void main(String[] args) {
        // Appraoch 1 : TC=> O(n^3)
        String text = "forgeeksskeegfor";
        //String text="Geeks";
        System.out.println("Longest Palindrome Substring -> " + findLongestPalindromeSubString(text));
    }
}
