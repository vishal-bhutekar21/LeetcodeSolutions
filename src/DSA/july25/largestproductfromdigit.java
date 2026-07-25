package DSA.july25;

/*
LeetCode 3536. Maximum Product of Two Digits
https://leetcode.com/problems/maximum-product-of-two-digits/

Problem:
Given a positive integer n, return the maximum product of any two digits present in n.

Example:
Input : 3124
Output: 12
Explanation:
Digits are {3,1,2,4}
Maximum product = 4 * 3 = 12
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestproductfromdigit {

    // ------------------------------------------------------------
    // Approach 1 : Brute Force
    // Compare every pair of digits
    // Time  : O(d²)
    // Space : O(d)
    // ------------------------------------------------------------
    static int maximumProductBruteForce(int n) {

        List<Integer> digits = new ArrayList<>();

        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        int maxProduct = 0;

        for (int i = 0; i < digits.size(); i++) {
            for (int j = i + 1; j < digits.size(); j++) {
                maxProduct = Math.max(maxProduct,
                        digits.get(i) * digits.get(j));
            }
        }

        return maxProduct;
    }

    // ------------------------------------------------------------
    // Approach 2 : Sorting
    // Store digits, sort them and multiply largest two
    // Time  : O(d log d)
    // Space : O(d)
    // ------------------------------------------------------------
    static int maximumProductSorting(int n) {

        List<Integer> digits = new ArrayList<>();

        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        Collections.sort(digits);

        int size = digits.size();

        return digits.get(size - 1) * digits.get(size - 2);
    }

    // ------------------------------------------------------------
    // Approach 3 : Optimal
    // Find largest and second largest digit in one traversal
    // Time  : O(d)
    // Space : O(1)
    // ------------------------------------------------------------
    static int maximumProductOptimal(int n) {

        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {

            int digit = n % 10;

            if (digit >= largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }

            n /= 10;
        }

        return largest * secondLargest;
    }

    public static void main(String[] args) {

        int n = 3124;

        System.out.println("Number : " + n);
        System.out.println();

        System.out.println("Brute Force  : " + maximumProductBruteForce(n));
        System.out.println("Sorting      : " + maximumProductSorting(n));
        System.out.println("Optimal      : " + maximumProductOptimal(n));
    }
}