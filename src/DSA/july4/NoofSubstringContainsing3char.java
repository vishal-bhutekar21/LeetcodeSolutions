//count of substring whose all three elements are present
package DSA.july4;

import java.util.Scanner;

public class NoofSubstringContainsing3char {



        static int numberOfSubstrings(String s) {
            int n = s.length();
            int count = 0;

            for (int i = 0; i < n; i++) {

                boolean hasA = false;
                boolean hasB = false;
                boolean hasC = false;

                for (int j = i; j < n; j++) {

                    char ch = s.charAt(j);

                    if (ch == 'a') hasA = true;
                    if (ch == 'b') hasB = true;
                    if (ch == 'c') hasC = true;

                    if (hasA && hasB && hasC) {
                        count++;
                    }
                }
            }

            return count;
        }

    static int numberOfSubstrings2(String s) {
        int[] counts = new int[3];
        int left = 0;
        int totalSubstrings = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            counts[s.charAt(right) - 'a']++;

            while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                counts[s.charAt(left) - 'a']--;
                left++;
            }

            totalSubstrings += left;
        }

        return totalSubstrings;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("the total no of substring it can form "+numberOfSubstrings(s));
        System.out.println();
        System.out.println("total no of substring couunt consting the all three character "+numberOfSubstrings2(s));
    }
}
//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

