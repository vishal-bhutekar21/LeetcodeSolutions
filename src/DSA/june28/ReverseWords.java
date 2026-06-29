package DSA.june28;

import java.util.Stack;

public class ReverseWords {

    // ---------------------------------------------------------
    // Approach 1 : Using split() + StringBuilder.reverse()
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static String approach1(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            ans.append(new StringBuilder(words[i]).reverse());

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    // ---------------------------------------------------------
    // Approach 2 : Manual Reverse Using Character Array
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static String approach2(String s) {

        char[] arr = s.toCharArray();

        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                int left = start;
                int right = end - 1;

                while (left < right) {

                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = end + 1;
            }
        }

        return new String(arr);
    }

    // ---------------------------------------------------------
    // Approach 3 : Using split() + Manual Reverse
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static String approach3(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                ans.append(word.charAt(j));
            }

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    // ---------------------------------------------------------
    // Approach 4 : Using Stack (Educational)
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static String approach4(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {

                stack.push(ch);

            } else {

                while (!stack.isEmpty()) {
                    ans.append(stack.pop());
                }

                ans.append(" ");
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    // ---------------------------------------------------------
    // Main Method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        System.out.println("Original String");
        System.out.println(s);

        System.out.println("\nApproach 1");
        System.out.println(approach1(s));

        System.out.println("\nApproach 2");
        System.out.println(approach2(s));

        System.out.println("\nApproach 3");
        System.out.println(approach3(s));

        System.out.println("\nApproach 4");
        System.out.println(approach4(s));
    }
}