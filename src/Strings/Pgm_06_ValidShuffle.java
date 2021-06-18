package Strings;

public class Pgm_06_ValidShuffle {
    public static boolean isValidShuffle(String res, String s1, String s2) {

        int len1 = s1.length(), len2 = s2.length(), lenres = res.length();
        if (len1 + len2 != lenres)
            return false;

        int i, j, k;
        i = j = k = 0;
        while (k < lenres) {
            if ((i < len1) && res.charAt(k) == s1.charAt(i)) // checks with s1
                i++;
            else if ((j < len2) && res.charAt(k) == s2.charAt(j)) // checks with s1
                j++;
            else
                return false;
            k++;
        }
        return true;
    }

    public static void main(String[] args) {

        String res = "1YX2", s1 = "XY", s2 = "12"; //1XY2
        System.out.println("Is Valid Shuffle " + res + " " + isValidShuffle(res, s1, s2));

        //Time Complexity = > O(m+n+k)
        // Approach 1 will not work when other 2  strings contain repeated chars
        //Approach 2 : Using DP

    }
}
