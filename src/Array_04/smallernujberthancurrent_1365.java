package Array_04;

import java.util.*;

public class smallernujberthancurrent_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];

        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }

        // Prefix sum to count numbers <= current
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }

        // Build answer
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = freq[nums[i] - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int[] result = smallerNumbersThanCurrent(nums);

        // Output result
        System.out.println("Output:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
