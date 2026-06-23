package DSA.june23;

import java.util.*;

public class TwoSum {

    // ===================================================
    // 1. Brute Force Approach
    // TC = O(n²)
    // SC = O(1)
    // ===================================================
    public static int[] bruteForce(int[] nums, int target) {

        // Check every possible pair
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // If sum equals target, return indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        return new int[]{-1, -1};
    }


    // ===================================================
    // 2. Optimized Approach (Sorting + Two Pointers)
    // TC = O(n log n)
    // SC = O(n)
    // ===================================================
    public static int[] optimized(int[] nums, int target) {

        int n = nums.length;

        // Store value and original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort according to values
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }


    // ===================================================
    // 3. Using HashMap (Best Solution)
    // Data Structure Used : HashMap
    // TC = O(n)
    // SC = O(n)
    // ===================================================
    public static int[] usingHashMap(int[] nums, int target) {

        // value -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // If complement exists, answer found
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number and index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(bruteForce(nums, target)));

        System.out.println(Arrays.toString(optimized(nums, target)));

        System.out.println(Arrays.toString(usingHashMap(nums, target)));
    }
}