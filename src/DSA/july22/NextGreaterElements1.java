package DSA.july22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElements1 {

    public static void main(String[] args) {
        NextGreaterElements1 sol = new NextGreaterElements1();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] resultBrute = sol.nextGreaterElementBruteForce(nums1, nums2);
        int[] resultStack = sol.nextGreaterElementStack(nums1, nums2);

        System.out.println("Brute Force: " + Arrays.toString(resultBrute));
        System.out.println("Monotonic Stack: " + Arrays.toString(resultStack));
    }

    // Approach 1: Brute Force
    public int[] nextGreaterElementBruteForce(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int nextGreater = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true;
                } else if (found && nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            ans[i] = nextGreater;
        }
        return ans;
    }

    // Approach 2: Optimal Monotonic Stack with HashMap
    public int[] nextGreaterElementStack(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}