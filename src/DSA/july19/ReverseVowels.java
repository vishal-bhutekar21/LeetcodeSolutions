package DSA.july19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseVowels {
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    static String reverseVowels(String s) {
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                chars.add(c);
            }
        }
        Collections.reverse(chars);
        int j = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (isVowel(result[i])) {
                result[i] = chars.get(j);
                j++;
            }
        }

        return String.valueOf(result);
    }

    static String reverseVowels2(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Fast ASCII lookup array (covers all 128 standard ASCII characters)
        boolean[] isVowel = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }

        while (left < right) {
            // Find the leftmost vowel using O(1) array lookup
            while (left < right && !isVowel[chars[left]]) {
                left++;
            }
            // Find the rightmost vowel using O(1) array lookup
            while (left < right && !isVowel[chars[right]]) {
                right--;
            }

            // Swap values
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }

        return new String(chars);
    }


    static String reverseVowels3(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Original String: " + s);
        System.out.println("Sorted vowels :" + reverseVowels(s));
    }

}
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/