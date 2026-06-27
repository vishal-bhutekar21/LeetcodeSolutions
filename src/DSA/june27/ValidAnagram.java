package DSA.june27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {

    /*
     * ==========================================================
     * APPROACH 1 : Sorting (Brute Force)
     * ==========================================================
     *
     * Intuition:
     * If two strings are anagrams, then after sorting both
     * strings they become identical.
     *
     * Time Complexity : O(n log n)
     * Space Complexity: O(n)
     *
     * Advantages:
     * - Very easy to understand.
     *
     * Disadvantages:
     * - Sorting is expensive.
     * - Extra memory is required.
     */

    static boolean usingSorting(String s, String t) {

        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    /*
     * ==========================================================
     * APPROACH 2 : Frequency Array (Optimal)
     * ==========================================================
     *
     * Works only for lowercase English letters.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     *
     * Best Interview Solution
     */

    static boolean usingFrequencyArray(String s, String t) {

        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;

            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {

            if (count != 0)
                return false;
        }

        return true;
    }

    /*
     * ==========================================================
     * APPROACH 3 : HashMap
     * ==========================================================
     *
     * Works for any characters.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */

    static boolean usingHashMap(String s, String t) {

        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch))
                return false;

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0)
                map.remove(ch);
        }

        return map.isEmpty();
    }

    /*
     * ==========================================================
     * APPROACH 4 : Two Frequency Arrays
     * ==========================================================
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */

    static boolean usingTwoFrequencyArrays(String s, String t) {

        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s.length(); i++) {

            freq1[s.charAt(i) - 'a']++;

            freq2[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(freq1, freq2);
    }

    /*
     * ==========================================================
     * MAIN METHOD
     * ==========================================================
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String : ");
        String s = sc.next();

        System.out.print("Enter Second String : ");
        String t = sc.next();

        System.out.println();

        System.out.println("Using Sorting               : " + usingSorting(s, t));

        System.out.println("Using Frequency Array       : " + usingFrequencyArray(s, t));

        System.out.println("Using HashMap               : " + usingHashMap(s, t));

        System.out.println("Using Two Frequency Arrays  : " + usingTwoFrequencyArrays(s, t));

        sc.close();
    }
}
