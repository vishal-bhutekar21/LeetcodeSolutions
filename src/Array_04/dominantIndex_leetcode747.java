package Array_04;
import java.util.*;

public class dominantIndex_leetcode747 {

    // LeetCode-required logic method
    public static int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;

        // Step 1: Find maximum element and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // Step 2: Check dominance condition
        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }

        return index;
    }

    // Main method for local testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(dominantIndex(nums));
        sc.close();
    }
}
