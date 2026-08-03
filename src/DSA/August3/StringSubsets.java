package DSA.August3;

import java.util.ArrayList;
import java.util.List;

public class StringSubsets {

    static List<String> ans(String s) {
        List<String> ans = new ArrayList<String>();

        System.out.println(); // empty subset

        int n = s.length();
        // Length 1
        for (int i = 0; i < n; i++) {
            System.out.println(s.charAt(i));
            ans.add(String.valueOf(s.charAt(i)));

        }

        // Length 2
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("" + s.charAt(i) + s.charAt(j));
                ans.add(String.valueOf(s.charAt(i)) + s.charAt(j));
            }
        }

        // Length 3
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
                    ans.add(s.charAt(i) + String.valueOf(s.charAt(j)) + s.charAt(k));
                }
            }
        }
        return ans;
    }

    static List<String> subsets(String s) {

        List<String> ans = new ArrayList<>();

        // Start with the empty subset
        ans.add("");

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Store current size
            int size = ans.size();

            // Add new subsets
            for (int j = 0; j < size; j++) {
                ans.add(ans.get(j) + ch);
            }
        }

        return ans;
    }

    static void main(String[] args) {

        System.out.println(ans("abc"));
        System.out.println(subsets("abc"));

    }
}