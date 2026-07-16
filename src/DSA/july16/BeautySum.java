package DSA.july16;

import java.util.Scanner;

public class BeautySum {
    static int beautifulString(String s) {
        int n = s.length();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                int max = 0;
                int min = Integer.MAX_VALUE;

                freq[s.charAt(j) - 'a']++;
                max = Math.max(max, freq[s.charAt(j) - 'a']);
                min = Math.min(min, freq[s.charAt(j) - 'a']);

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }


                }
                ans += max - min;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(" the answer is " + beautifulString(s));
    }
}
//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
