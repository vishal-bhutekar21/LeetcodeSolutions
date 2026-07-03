package DSA.july3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    static boolean canconstruct(String ransomNote, String magazine) {

        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0) {
                return false;
            }

        }


        return true;
    }

    static boolean canConstruct2(String ransomNote, String magazine) {
        char ch1[] = ransomNote.toCharArray();
        Arrays.sort(ch1);
        char ch2[] = magazine.toCharArray();
        Arrays.sort(ch2);
        String s1 = new String(ch1);
        String s2 = new String(ch2);


        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }


        return i == s1.length();
    }

    static boolean canConstruct3(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ransomNote,magazine;
        ransomNote=sc.next();
        magazine=sc.next();
        System.out.println(" Can Construct :"+ canconstruct(ransomNote, magazine));
        System.out.println();
        System.out.println("Can construct :"+ canConstruct2(ransomNote,magazine));
    }


}
