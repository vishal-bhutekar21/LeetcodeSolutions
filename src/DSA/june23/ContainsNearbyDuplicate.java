package DSA.june23;

import java.util.HashMap;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println("Brute Force     : " + bruteForce(nums, k));
        System.out.println("Optimized       : " + optimized(nums, k));
        System.out.println("Using HashMap   : " + usingHashMap(nums, k));
    }

    // ==================================================
    // Pattern : Array + Hashing
    //
    // Observation:
    // Need to find whether there exist two equal elements
    // whose index difference is at most k.
    // ==================================================


    // ==================================================
    // 1. Brute Force
    //
    // Compare every pair and check:
    // nums[i] == nums[j] && |i-j| <= k
    //
    // Time Complexity : O(n²)
    // Space Complexity: O(1)
    // ==================================================
    public static boolean bruteForce(int[] nums, int k) {

        // Traverse every element
        for (int i = 0; i < nums.length; i++) {

            // Compare with remaining elements
            for (int j = i + 1; j < nums.length; j++) {

                // Duplicate found within distance k
                if (nums[i] == nums[j] && Math.abs(i-j) <= k) {
                    return true;
                }
            }
        }

        // No duplicate found
        return false;
    }


    // ==================================================
    // 2. Optimized Approach
    //
    // Store latest index of every element.
    // If current index - previous index <= k,
    // duplicate exists nearby.
    //
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ==================================================
    public static boolean optimized(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for (int i = 0; i < nums.length; i++) {

            // Number already seen before
            if (map.containsKey(nums[i])) {

                int previousIndex = map.get(nums[i]);

                // Check distance
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Update latest index
            map.put(nums[i], i);
        }

        return false;
    }


    // ==================================================
    // 3. Using HashMap (Best Solution)
    //
    // Data Structure Used : HashMap
    //
    // Key   : Number
    // Value : Latest Index
    //
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ==================================================
    public static boolean usingHashMap(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Duplicate number encountered
            if (map.containsKey(nums[i])) {

                // Check index difference
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            // Store latest occurrence
            map.put(nums[i], i);
        }

        return false;
    }
}