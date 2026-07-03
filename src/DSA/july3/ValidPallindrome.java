package DSA.july3;

import java.util.Scanner;
// checks if the string is pallindrome with remove the spaces and the symbos and he digits

public class ValidPallindrome {
    class Solution {
        static boolean isPalindrome2(String s) {

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {


                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }


                if (Character.toLowerCase(s.charAt(left)) !=
                        Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

    static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();


        return cleaned.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.println("is pallindrome ="+isPalindrome(s));
    }
}
