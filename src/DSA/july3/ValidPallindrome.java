package DSA.july3;

import java.util.Scanner;
// checks if the string is pallindrome with remove the spaces and the symbos and he digits

public class ValidPallindrome {

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
