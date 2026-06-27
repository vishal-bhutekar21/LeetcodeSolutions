package DSA.june27;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLastWord {

    /*
     * ==========================================================
     * APPROACH 1 : Using split()
     * ==========================================================
     *
     * Intuition:
     * Split the string into words and return the length of
     * the last word.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     *
     * Advantages:
     * - Very easy to understand.
     *
     * Disadvantages:
     * - Creates extra array.
     * - Creates extra String objects.
     * - Not memory efficient.
     */

    static int usingSplit(String s) {

        if (s == null || s.trim().isEmpty())
            return 0;

        String[] words = s.trim().split("\\s+");

        return words[words.length - 1].length();
    }

    /*
     * ==========================================================
     * APPROACH 2 : Using trim() + lastIndexOf()
     * ==========================================================
     *
     * Intuition:
     * Remove leading/trailing spaces.
     * Find the last space.
     * Answer = Total Length - Last Space Index - 1
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1) Auxiliary
     */

    static int usingLastIndex(String s) {

        if (s == null || s.trim().isEmpty())
            return 0;

        s = s.trim();

        int lastSpace = s.lastIndexOf(' ');

        return s.length() - lastSpace - 1;
    }

    /*
     * ==========================================================
     * APPROACH 3 : Reverse Traversal (Optimal)
     * ==========================================================
     *
     * Intuition:
     * Start from end.
     * Skip trailing spaces.
     * Count characters until another space is found.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     *
     * Best Interview Solution
     */

    static int usingReverseTraversal(String s) {

        if (s == null || s.length() == 0)
            return 0;

        int index = s.length() - 1;
        int length = 0;

        // Skip trailing spaces

        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // Count last word

        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }

    /*
     * ==========================================================
     * APPROACH 4 : Manual Forward Traversal
     * ==========================================================
     *
     * Intuition:
     * Traverse from left to right.
     * Whenever a word starts, reset count.
     * Current count becomes answer.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */

    static int usingForwardTraversal(String s) {

        if (s == null || s.length() == 0)
            return 0;

        int currentLength = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {

                currentLength++;

                answer = currentLength;

            } else {

                currentLength = 0;

            }
        }

        return answer;
    }

    /*
     * ==========================================================
     * MAIN METHOD
     * ==========================================================
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");

        String s = sc.nextLine();

        System.out.println();

        System.out.println("Using Split              : " + usingSplit(s));

        System.out.println("Using LastIndexOf        : " + usingLastIndex(s));

        System.out.println("Using Reverse Traversal  : " + usingReverseTraversal(s));

        System.out.println("Using Forward Traversal  : " + usingForwardTraversal(s));

        sc.close();
    }
}