package Strings;

public class CountAndSay_07 {

    public static String Print_CountandSay(int series) {
        String newResult = "";
        String text = "1";
        int i = series;
        if(series ==1 ) return "1";
      
        while (i >= 2) {
            newResult = "";
            int j = 0, count = 0;
            char prev = text.charAt(0), current = text.charAt(0);
            while (j <= text.length() - 1) {
                prev = current;
                current = text.charAt(j);
                if (prev == current) {
                    count++;
                    j++;

                } else {
                    newResult += count + "" + prev;
                    j++;
                    count=1;
                }
              
                if (j == text.length())
                    newResult += count + "" + current;

            }

            text = newResult;
            i--;
           

        }
        return text;
    

    }

    public static void main(String[] args) {
        System.out.println(Print_CountandSay(5));
    }
}
