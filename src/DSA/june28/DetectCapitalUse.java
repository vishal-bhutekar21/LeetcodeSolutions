package DSA.june28;

public class DetectCapitalUse {

    public static boolean detectCapitalUse(String word) {

        int upper = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }

        if (upper == word.length()) {
            return true;    // All uppercase
        }

        if (upper == 0) {
            return true;    // All lowercase
        }

        if (upper == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;    // Only first letter is uppercase
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("USA"));        // true
        System.out.println(detectCapitalUse("leetcode"));   // true
        System.out.println(detectCapitalUse("Google"));     // true
        System.out.println(detectCapitalUse("FlaG"));       // false
        System.out.println(detectCapitalUse("mL"));         // false
    }
}