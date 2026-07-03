package DSA.july3;

import java.util.Scanner;

public class pallindromeSr {
    static boolean ispallindrome(String s) {
        if (s == null) {
            return false;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    static boolean isPalindromeStringBuilder(String s) {
        if (s == null) return false;

        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    static boolean isPalindromeRecursive(String s) {
        if (s == null) return false;
        return checkRecursive(s, 0, s.length() - 1);
    }

    private static boolean checkRecursive(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return checkRecursive(s, i + 1, j - 1);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        System.out.println("is pallindrom :=" + ispallindrome(s));
    }
}