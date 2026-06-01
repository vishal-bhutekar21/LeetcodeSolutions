package CodeForces.TLE1000;

import java.util.Scanner;

public class DigitString2230B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        String s = sc.next();
        int n = s.length();

        int[] pref2 = new int[n + 1];
        int[] suf13 = new int[n + 1];

        // prefix count of '2'
        for (int i = 0; i < n; i++) {
            pref2[i + 1] = pref2[i];
            if (s.charAt(i) == '2') {
                pref2[i + 1]++;
            }
        }

        // suffix count of '1' and '3'
        for (int i = n - 1; i >= 0; i--) {
            suf13[i] = suf13[i + 1];
            char ch = s.charAt(i);

            if (ch == '1' || ch == '3') {
                suf13[i]++;
            }
        }

        int maxKeep = 0;

        for (int i = 0; i <= n; i++) {
            maxKeep = Math.max(maxKeep, pref2[i] + suf13[i]);
        }

        System.out.println(n - maxKeep);
    }
}