package DSA;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChar {
    static int longestChar(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
                ans = Math.max(ans, j - i + 1);

            }

        }
        return ans;
    }

    static int longestCharoptminal(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {


            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }

    static int lengthOfLongestSubstring(String s) {

        int[] freq = new int[128];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("using the sliding window " + longestCharoptminal(s));
        System.out.println("using Frequency Array " + lengthOfLongestSubstring(s));
        System.out.println("longest substring without repeating char is " + longestChar(s));
    }
}
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/