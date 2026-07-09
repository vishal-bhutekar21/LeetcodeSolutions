package DSA.july9;

/*
    LeetCode 724. Find Pivot Index
    Problem Link:
    https://leetcode.com/problems/find-pivot-index/

    Approach:
    1. Calculate the total sum of the array.
    2. Maintain a variable leftSum.
    3. For each index:
       - rightSum = totalSum - leftSum - nums[i]
       - If leftSum == rightSum, return the current index.
       - Otherwise, add nums[i] to leftSum.
    4. If no pivot index is found, return -1.

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class pivotindex {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println("Pivot Index = " + solution.pivotIndex(nums));
    }
}

class Solution {

    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}