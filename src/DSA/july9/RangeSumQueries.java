package DSA.july9;

/**
 * Problem ID   : 303
 * Problem Name : Range Sum Query - Immutable
 * LeetCode     : https://leetcode.com/problems/range-sum-query-immutable/
 *
 * Approach Used:
 * Prefix Sum
 *
 * Time Complexity:
 * Constructor : O(n)
 * sumRange()  : O(1)
 *
 * Space Complexity:
 * O(n)
 */

public class RangeSumQueries {

    static class NumArray {

        private int[] prefix;

        public NumArray(int[] nums) {
            prefix = new int[nums.length + 1];

            for (int i = 0; i < nums.length; i++) {
                prefix[i + 1] = prefix[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
    }


//    private int nums[];
//    public NumArray(int[] nums) {
//        this.nums=nums;
//
//
//    }
//
//    public int sumRange(int left, int right) {
//
//        int sum=0;
//
//        for(int i=left;i<=right;i++){
//            sum+=nums[i];
//        }
//        return sum;
//    }
//}

    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(nums);

        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }
}