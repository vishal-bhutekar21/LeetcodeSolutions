package DSA.july19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortVowels {
    static String sortVowelsbruteforce(String s) {
        List<Character> vowels = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                vowels.add(c);
            }

        }
        Collections.sort(vowels);
        int k = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel2(c)) {
                result[i] = vowels.get(k);
                k++;
            }

        }

        return new String(result);

    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    static boolean isVowel2(char c) {
        String vowel = "aeiouAEIOU";
        return vowel.contains(String.valueOf(c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Original String: " + s);
        System.out.println("Sorted using the Brute force :" + sortVowelsbruteforce(s));
    }


}


//https://leetcode.com/problems/sort-vowels-in-a-string/
