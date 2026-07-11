package DSA.july10;

import java.util.Scanner;

public class PermutationInString {

    static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (matches(freq1, freq2)) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {

            freq2[s2.charAt(i) - 'a']++;

            freq2[s2.charAt(i - k) - 'a']--;

            if (matches(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    static boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s2 = sc.next();
        String s1 = sc.next();

        System.out.println("contains or not " + checkInclusion(s1, s2));
    }
}
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
