package DSA.july18;

import java.util.Arrays;

public class MergesortedArray {

    // =========================================================================
    // MAIN METHOD: For Local Verification and Testing
    // =========================================================================
    public static void main(String[] args) {
        MergesortedArray solution = new MergesortedArray();

        // Test Data Layout
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Original nums1: [1, 2, 3, 0, 0, 0] | nums2: [2, 5, 6]");

        // Testing Approach 2 (The most optimal approach)
        solution.mergeApproach2(nums1, m, nums2, n);

        System.out.println("Merged Result:  " + Arrays.toString(nums1));
    }

    // =========================================================================
    // APPROACH 1: System.arraycopy + Arrays.sort() (Your Approach)
    // Time Complexity: O((M+N) log(M+N)) | Space Complexity: O(1)
    // =========================================================================
    public void mergeApproach1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    // =========================================================================
    // APPROACH 2: Three-Pointer / Reverse Merge (Optimal Solution)
    // Time Complexity: O(M+N) | Space Complexity: O(1)
    // Fills nums1 from back-to-front to avoid overriding elements.
    // =========================================================================
    public void mergeApproach2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;     // Pointer for valid elements in nums1
        int p2 = n - 1;     // Pointer for elements in nums2
        int p = m + n - 1;  // Pointer for the insertion slot at the end of nums1

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }

    // =========================================================================
    // APPROACH 3: Extra Memory Buffer (Forward Two-Pointer)
    // Time Complexity: O(M+N) | Space Complexity: O(M)
    // Copies valid elements of nums1 out first, then merges linearly.
    // =========================================================================
    public void mergeApproach3(int[] nums1, int m, int[] nums2, int n) {
        // Create a copy of the first m elements of nums1
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        int p1 = 0; // Pointer for nums1Copy
        int p2 = 0; // Pointer for nums2
        int p = 0;  // Pointer for writing into nums1

        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] <= nums2[p2]) {
                nums1[p] = nums1Copy[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
            p++;
        }

        // Copy remaining elements from nums1Copy if any exist
        while (p1 < m) {
            nums1[p] = nums1Copy[p1];
            p1++;
            p++;
        }

        // Copy remaining elements from nums2 if any exist
        while (p2 < n) {
            nums1[p] = nums2[p2];
            p2++;
            p++;
        }
    }

    // =========================================================================
    // APPROACH 4: Simple Manual Loop Merger (Alternative to Arraycopy)
    // Time Complexity: O((M+N) log(M+N)) | Space Complexity: O(1)
    // Uses a simple manual loop for merging instead of system memory copies.
    // =========================================================================
    public void mergeApproach4(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}

// LeetCode Problem Link: https://leetcode.com
