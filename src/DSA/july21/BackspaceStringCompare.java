package DSA.july21;

import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {

    // ---------------- Brute Force ----------------
    static String bruteForce(String s) {

        while (s.contains("#")) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '#') {

                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }

                } else {
                    sb.append(s.charAt(i));
                }
            }

            s = sb.toString();
        }

        return s;
    }

    static boolean bruteForceCompare(String s, String t) {
        return bruteForce(s).equals(bruteForce(t));
    }

    // ---------------- Stack Solution ----------------
    static String stackProcess(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '#') {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    static boolean stackCompare(String s, String t) {

        return stackProcess(s).equals(stackProcess(t));
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String : ");
        String s = sc.next();

        System.out.print("Enter Second String : ");
        String t = sc.next();

        System.out.println();

        System.out.println("Brute Force Result : " +
                bruteForceCompare(s, t));

        System.out.println("Stack Result : " +
                stackCompare(s, t));

        System.out.println();

        System.out.println("Processed First String : "
                + stackProcess(s));

        System.out.println("Processed Second String : "
                + stackProcess(t));
    }
}