package DSA.july21;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

    // ---------------- Brute Force ----------------
    static String bruteForce(String s) {

        boolean changed = true;

        while (changed) {

            changed = false;
            StringBuilder ans = new StringBuilder();

            int i = 0;

            while (i < s.length()) {

                if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {

                    // Skip both duplicate characters
                    changed = true;
                    i += 2;

                } else {

                    ans.append(s.charAt(i));
                    i++;
                }
            }

            s = ans.toString();
        }

        return s;
    }

    // ---------------- Stack Solution ----------------
    static String stackSolution(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = sc.next();

        System.out.println();

        System.out.println("Original String : " + s);

        System.out.println("Brute Force Answer : " + bruteForce(s));

        System.out.println("Stack Answer : " + stackSolution(s));
    }
}
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/