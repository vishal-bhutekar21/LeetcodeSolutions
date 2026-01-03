package Array_04;

import java.util.Scanner;

public class canJump55 {

    // Method to check if we can reach the last index
    public static boolean canJump(int[] nums) {
        // maxReach is the farthest index we can reach so far
        int maxReach = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If current index is beyond our maxReach, we can't go further
            if (i > maxReach) {
                return false;
            }
            // Update the farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
            // Optional early exit if we already can reach the end
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // If we finish the loop, we can reach the last index
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements (space-separated):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = canJump(nums);
        System.out.println("Can reach last index? " + result);

        sc.close();
    }
}
