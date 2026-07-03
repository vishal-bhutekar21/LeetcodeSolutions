package DSA.july3;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharactersofstring {

    // ------------------- Using Frequency Array -------------------
    // Time Complexity: O(n + m)
    // n = length of chars
    // m = total number of characters in all words
    // Space Complexity: O(1) (26 integers)

    static int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = 0;

        for (String word : words) {

            int[] temp = freq.clone();
            boolean canForm = true;

            for (char ch : word.toCharArray()) {
                temp[ch - 'a']--;

                if (temp[ch - 'a'] < 0) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                count += word.length();
            }
        }

        return count;
    }

    // ------------------- Using HashMap -------------------
    // Time Complexity: O(n + m)
    // n = length of chars
    // m = total number of characters in all words
    // Space Complexity: O(k)
    // k = number of distinct characters (at most 26 here)

    static int countCharactersUsingMap(String[] words, String chars) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of chars
        for (char ch : chars.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;

        for (String word : words) {

            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean canForm = true;

            for (char ch : word.toCharArray()) {

                if (!temp.containsKey(ch) || temp.get(ch) == 0) {
                    canForm = false;
                    break;
                }

                temp.put(ch, temp.get(ch) - 1);
            }

            if (canForm) {
                count += word.length();
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.print("Enter chars: ");
        String chars = sc.nextLine();

        int ans1 = countCharacters(words, chars);
        int ans2 = countCharactersUsingMap(words, chars);

        System.out.println("\nUsing Frequency Array: " + ans1);
        System.out.println("Using HashMap: " + ans2);

        sc.close();
    }
}