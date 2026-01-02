package Array_04;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class searchRange_34 {

    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
        return new int[]{first, last};
    }

    private int findIndex(int[] nums, int target, boolean findFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                result = mid;
                if (findFirst) {
                    right = mid - 1;   // search left side
                } else {
                    left = mid + 1;    // search right side
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        searchRange_34 solution = new searchRange_34();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
