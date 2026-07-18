package DSA.july18;

public class NextGreatestLetter {

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        System.out.println("Linear Search Answer  : " +
                nextGreatestLetterLinear(letters, target));

        System.out.println("Binary Search Answer  : " +
                nextGreatestLetterBinary(letters, target));

        // Wrap-around example
        char target2 = 'j';

        System.out.println("\nTarget = " + target2);

        System.out.println("Linear Search Answer  : " +
                nextGreatestLetterLinear(letters, target2));

        System.out.println("Binary Search Answer  : " +
                nextGreatestLetterBinary(letters, target2));
    }

    // ---------------------------------------------------------
    // Approach 1 : Linear Search
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // ---------------------------------------------------------
    static char nextGreatestLetterLinear(char[] letters, char target) {

        for (char ch : letters) {
            if (ch > target) {
                return ch;
            }
        }

        // Wrap around
        return letters[0];
    }

    // ---------------------------------------------------------
    // Approach 2 : Binary Search
    // Time Complexity : O(log n)
    // Space Complexity : O(1)
    // ---------------------------------------------------------
    static char nextGreatestLetterBinary(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start == letters.length) {
            return letters[0];
        }

        return letters[start];
    }
}

/*
LeetCode 744. Find Smallest Letter Greater Than Target
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
*/