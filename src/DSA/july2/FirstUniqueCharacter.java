package DSA.july2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = sc.next();

        System.out.println("\n========== APPROACH 1 : Frequency Array ==========");
        int ans1 = firstUniqueArray(s);

        if (ans1 == -1)
            System.out.println("No unique character found.");
        else
            System.out.println("First Unique Character Index : " + ans1 +
                    " Character : " + s.charAt(ans1));

        System.out.println("\n========== APPROACH 2 : HashMap ==========");
        int ans2 = firstUniqueHashMap(s);

        if (ans2 == -1)
            System.out.println("No unique character found.");
        else
            System.out.println("First Unique Character Index : " + ans2 +
                    " Character : " + s.charAt(ans2));

        sc.close();
    }

    // ===========================================================
    // APPROACH 1 : Frequency Array
    // ===========================================================

    /*
        Idea:
        -----
        Since the string contains only lowercase English letters
        ('a' to 'z'), we create an array of size 26.

        Step 1:
        Count frequency of every character.

        Step 2:
        Traverse the string again.

        The first character whose frequency is 1
        is the first unique character.

        Why does this work?

        First traversal stores frequency.
        Second traversal preserves original order.
        Therefore the first frequency == 1 character
        is the required answer.
    */

    static int firstUniqueArray(String s) {

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch - 'a'] == 1)
                return i;
        }

        return -1;
    }

    /*
        Time Complexity : O(n)

        Space Complexity : O(1)

        Reason:
        Frequency array size is always 26.
    */


    // ===========================================================
    // APPROACH 2 : HashMap
    // ===========================================================

    /*
        Idea:
        -----

        Instead of an array, use a HashMap.

        HashMap stores:

            Character -> Frequency

        First traversal:
        Count every character.

        Second traversal:
        Return first character having frequency 1.

        This approach works for

        • lowercase
        • uppercase
        • digits
        • symbols
        • Unicode characters

        Unlike the array approach,
        it is not restricted to 26 letters.
    */

    static int firstUniqueHashMap(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    /*
        Time Complexity : O(n)

        Space Complexity : O(k)

        k = Number of distinct characters

        Worst Case : O(n)

        Better when characters are not limited
        to only lowercase letters.
    */

}