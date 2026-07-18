package DSA.july18;

import java.util.ArrayList;
import java.util.List;

public class BuddyStrings {

    // -------------------- Brute Force --------------------

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isEqual(char[] arr, String goal) {
        return String.valueOf(arr).equals(goal);
    }

    public static boolean buddyStringsBrute(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                swap(arr, i, j);

                if (isEqual(arr, goal)) {
                    return true;
                }

                // Restore original string
                swap(arr, i, j);
            }
        }

        return false;
    }

    // -------------------- Optimal --------------------

    public static boolean buddyStringsOptimal(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        // If both strings are already equal
        if (s.equals(goal)) {

            int[] freq = new int[26];

            for (char c : s.toCharArray()) {

                freq[c - 'a']++;

                if (freq[c - 'a'] > 1) {
                    return true;
                }
            }

            return false;
        }

        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }

        if (diff.size() != 2) {
            return false;
        }

        int first = diff.get(0);
        int second = diff.get(1);

        return s.charAt(first) == goal.charAt(second)
                && s.charAt(second) == goal.charAt(first);
    }

    // -------------------- Driver --------------------

    public static void main(String[] args) {

        String s = "ab";
        String goal = "ba";

        System.out.println("Brute Force : " + buddyStringsBrute(s, goal));
        System.out.println("Optimal     : " + buddyStringsOptimal(s, goal));

        System.out.println();

        s = "aa";
        goal = "aa";

        System.out.println("Brute Force : " + buddyStringsBrute(s, goal));
        System.out.println("Optimal     : " + buddyStringsOptimal(s, goal));

        System.out.println();

        s = "ab";
        goal = "ab";

        System.out.println("Brute Force : " + buddyStringsBrute(s, goal));
        System.out.println("Optimal     : " + buddyStringsOptimal(s, goal));
    }
}


//https://leetcode.com/problems/buddy-strings/