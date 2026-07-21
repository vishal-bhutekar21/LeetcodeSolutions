package DSA.july21;

import java.util.Scanner;
import java.util.Stack;

//
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//            (){}        --
//
//        for (char ch : s.toCharArray()) {
//
//            if (ch == '(') {
//                stack.push(')');
//            } else if (ch == '[') {
//                stack.push(']');
//            } else if (ch == '{') {
//                stack.push('}');
//            } else {
//                if (stack.isEmpty() || stack.pop() != ch) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }
//}
public class ValidParanthesis {

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Process closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char pop = stack.pop();

                if (ch == ')' && pop != '(') {
                    return false;
                } else if (ch == ']' && pop != '[') {
                    return false;
                } else if (ch == '}' && pop != '{') {
                    return false;
                }
            }


        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("isValid: " + isValid(s));

//        System.out.println("stack contains :" + stack);
    }
}
