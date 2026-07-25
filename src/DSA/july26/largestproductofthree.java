package DSA.july26;

import java.util.Arrays;

public class LargestProductOfThree {

    public static void main(String[] args) {

        LargestProductOfThree obj = new LargestProductOfThree();

        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {-10, -10, 5, 2};
        int[] nums3 = {-5, -4, -3, -2};

        System.out.println("Using Sorting:");
        System.out.println(obj.maximumProduct(nums));
        System.out.println(obj.maximumProduct(nums2));
        System.out.println(obj.maximumProduct(nums3));

        System.out.println();

        System.out.println("Using One Pass:");
        System.out.println(obj.maximumProductOnePass(nums));
        System.out.println(obj.maximumProductOnePass(nums2));
        System.out.println(obj.maximumProductOnePass(nums3));
    }

    /*
     * LeetCode 628 - Maximum Product of Three Numbers
     * https://leetcode.com/problems/maximum-product-of-three-numbers/
     *
     * Approach 1 : Sorting
     *
     * After sorting there are only two possible answers:
     *
     * 1. Product of the three largest numbers
     *      nums[n-1] * nums[n-2] * nums[n-3]
     *
     * 2. Product of two smallest numbers and the largest number
     *      nums[0] * nums[1] * nums[n-1]
     *
     * Why second case?
     * Because two negative numbers become positive after multiplication.
     *
     * Time Complexity : O(n log n)
     * Space Complexity: O(1)
     */
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    /*
     * Approach 2 : One Pass (Optimal)
     *
     * Find:
     * 1. Three largest numbers
     * 2. Two smallest numbers
     *
     * Then compare:
     * largest1 * largest2 * largest3
     * and
     * smallest1 * smallest2 * largest1
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */
    public int maximumProductOnePass(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Update three largest numbers
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update two smallest numbers
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;

        return Math.max(product1, product2);
    }
}