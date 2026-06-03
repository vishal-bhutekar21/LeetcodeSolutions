package Codechef_solutions;

import java.util.Scanner;

public class NO3Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }

    static void solve(Scanner sc) {

        // Length of the string
        int n = sc.nextInt();

        // Input string
        String s = sc.next();

        // Stores minimum edits required
        int ans = 0;

        // Length of current consecutive character group
        int count = 1;

        // Traverse the string and find groups of same characters
        for (int i = 1; i < n; i++) {

            // If current character is same as previous character,
            // extend the current group
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {

                // Current group ended
                // For a group of length L,
                // minimum edits required = L / 3
                ans += count / 3;

                // Start a new group
                count = 1;
            }
        }

        // Add contribution of the last group
        ans += count / 3;

        // Print minimum edits required
        System.out.println(ans);
    }
}