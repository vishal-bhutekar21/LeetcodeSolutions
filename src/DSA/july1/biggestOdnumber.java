package DSA.july1;

import java.util.Scanner;

public class biggestOdnumber {

        public static  String largestOddNumber(String num) {

            for (int i = num.length() - 1; i >= 0; i--) {

                if ((num.charAt(i) - '0') % 2 == 1) {
                    return num.substring(0, i+1);
                }
            }

            return "";
        }
    public static String largestOddNumber2(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {

            if ((num.charAt(i) & 1) == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(largestOddNumber(s));
    }
}
