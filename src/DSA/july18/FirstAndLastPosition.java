package DSA.july18;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPosition {

    // Brute Force - O(n)
    static int[] searchRangeBrute(int[] nums, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }

        if (ans.size() == 0) {
            return new int[]{-1, -1};
        }

        return new int[]{ans.get(0), ans.get(ans.size() - 1)};
    }

    // Binary Search - O(log n)
    static int[] searchRangeBinary(int[] nums, int target) {

        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);

        return new int[]{first, last};
    }

    static int findIndex(int[] nums, int target, boolean findFirst) {

        int left = 0;
        int right = nums.length - 1;
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
                    right = mid - 1; // Search left
                } else {
                    left = mid + 1; // Search right
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println("Brute Force : " +
                Arrays.toString(searchRangeBrute(nums, target)));

        System.out.println("Binary Search: " +
                Arrays.toString(searchRangeBinary(nums, target)));
    }
}//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
