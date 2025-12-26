package Strings_05;

import java.util.Scanner;

public class LastWord_58 {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

}


//https://leetcode.com/problems/length-of-last-word/


/// public int lengthOfLastWord(String s) {
///         String[] arr = s.split("\\s");
///         return arr[arr.length-1].length();
///     }