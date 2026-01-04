package Array_04;/*
LeetCode 611 - Valid Triangle Number
Problem Link: https://leetcode.com/problems/valid-triangle-number/
*/

import java.util.*;

public class TriangleNumber66 {

    // ---------- BRUTE FORCE O(n^3) ----------
    public static int triangleNumberBruteForce(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];

                    if (a + b > c && a + c > b && b + c > a) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // ---------- TWO POINTER O(n^2) ----------
    public static int triangleNumberTwoPointer(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {

            int i = 0;
            int j = k - 1;

            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int bruteForceResult = triangleNumberBruteForce(nums.clone());
        int twoPointerResult = triangleNumberTwoPointer(nums.clone());

        System.out.println("Brute Force Result: " + bruteForceResult);
        System.out.println("Two Pointer Result: " + twoPointerResult);
    }
}
