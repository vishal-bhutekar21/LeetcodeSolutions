package DSA.july16;

import java.util.Arrays;
import java.util.Scanner;

public class gcdSum {

    static long calculateGcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mx = 0;

        // Step 1: Construct the prefixGcd array using the running maximum
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(nums[i], mx);
        }

        // Step 2: Sort the constructed prefixGcd array
        Arrays.sort(prefixGcd);

        long sum = 0;
        int left = 0;
        int right = n - 1;

        // Step 3: Use the two-pointer approach to pair smallest with largest
        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        // The single middle element (when left == right) is explicitly skipped per problem statement

        return sum;
    }

    // Iterative Euclidean algorithm for optimal performance
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("prefix gcd sum " + calculateGcdSum(nums));
        sc.close();
    }
}
//https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/description/