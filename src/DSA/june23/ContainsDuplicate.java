package DSA.june23;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    // ==================================================
    // Pattern : Array + Hashing
    //
    // Observation:
    // Need to determine whether any element appears
    // more than once in the array.
    // ==================================================


    // ==================================================
    // 1. Brute Force Approach
    //
    // Intuition:
    // Compare every pair of elements. If any pair is
    // equal, duplicate exists.
    //
    // Time Complexity : O(n²)
    // Space Complexity: O(1)
    // ==================================================
    public static boolean bruteForce(int[] nums) {

        // Compare every pair
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Duplicate found
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        // No duplicate found
        return false;
    }


    // ==================================================
    // 2. Optimized Approach (Sorting)
    //
    // Intuition:
    // After sorting, duplicate elements become adjacent.
    //
    // Time Complexity : O(n log n)
    // Space Complexity: O(1) (Ignoring sorting space)
    // ==================================================
    public static boolean optimized(int[] nums) {

        // Create copy so original array remains unchanged
        int[] arr = nums.clone();

        // Sort the array
        Arrays.sort(arr);

        // Check adjacent elements
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }

        // No duplicate found
        return false;
    }


    // ==================================================
    // 3. Using HashSet (Best Solution)
    //
    // Data Structure Used : HashSet
    //
    // Why HashSet?
    // HashSet stores only unique elements.
    // If an element already exists, duplicate is found.
    //
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ==================================================
    public static boolean usingHashSet(int[] nums) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // Traverse array
        for (int num : nums) {

            // Duplicate found
            if (set.contains(num)) {
                return true;
            }

            // Add current element
            set.add(num);
        }

        // No duplicate found
        return false;
    }


    // ==================================================
    // Main Function
    // ==================================================
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println("Brute Force      : " + bruteForce(nums));

        System.out.println("Optimized        : " + optimized(nums));

        System.out.println("Using HashSet    : " + usingHashSet(nums));
    }
}