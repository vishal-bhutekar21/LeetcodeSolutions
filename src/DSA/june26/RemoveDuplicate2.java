package DSA.june26;

import java.util.Arrays;

public class RemoveDuplicate2 {

    // ------------------------------------------------------------
    // Brute Force Approach
    // Time Complexity  : O(n)
    // Space Complexity : O(n)
    // ------------------------------------------------------------
    public static int removeDuplicatesBrute(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int[] temp = new int[nums.length];

        // First two elements are always allowed
        temp[0] = nums[0];
        temp[1] = nums[1];

        int k = 2;

        for (int i = 2; i < nums.length; i++) {

            // Compare with element two positions before in temp
            if (nums[i] != temp[k - 2]) {
                temp[k] = nums[i];
                k++;
            }
        }

        // Copy back to original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }

    // ------------------------------------------------------------
    // Optimal Approach (Two Pointer)
    // Time Complexity  : O(n)
    // Space Complexity : O(1)
    // ------------------------------------------------------------
    public static int removeDuplicatesOptimal(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int j = 2;

        for (int i = 2; i < nums.length; i++) {

            // If current element is different from the element
            // two positions before the write pointer,
            // then it is safe to keep.
            if (nums[i] != nums[j - 2]) {

                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    // Print only the valid part of the array
    public static void printArray(int[] nums, int length) {

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1, 2, 2, 3};

        System.out.println("Original Array : " + Arrays.toString(arr1));

        int length1 = removeDuplicatesBrute(arr1);

        System.out.println("\nAfter Brute Force");
        System.out.println("Length : " + length1);
        printArray(arr1, length1);

        System.out.println("--------------------------------");

        int[] arr2 = {1, 1, 1, 2, 2, 3};

        int length2 = removeDuplicatesOptimal(arr2);

        System.out.println("After Optimal");
        System.out.println("Length : " + length2);
        printArray(arr2, length2);
    }
}