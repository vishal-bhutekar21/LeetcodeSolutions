package DSA.july22;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElements {

    public static void main(String[] args) {
        nextGreaterElements sol = new nextGreaterElements();
        int[] nums = {1, 2, 1};

        int[] resultBrute = sol.nextGreaterElementsBruteForce(nums);
        int[] resultStack = sol.nextGreaterElementsStack(nums);

        System.out.println("Brute Force: " + Arrays.toString(resultBrute));
        System.out.println("Monotonic Stack: " + Arrays.toString(resultStack));
    }

    // Approach 1: Brute Force with Circular Array Traversal
    public int[] nextGreaterElementsBruteForce(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        // Iterate through each element
        for (int i = 0; i < n; i++) {
            // Check subsequent elements circularly
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                if (nums[index] > nums[i]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }
        return ans;
    }

    // Approach 2: Optimal Monotonic Stack with Circular Array Simulation
    public int[] nextGreaterElementsStack(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();

        // Traverse twice to simulate the circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            // Pop elements smaller than or equal to current element
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[idx]) {
                stack.pop();
            }

            // Assign next greater element for the first pass
            if (i < n) {
                if (!stack.isEmpty()) {
                    ans[idx] = nums[stack.peek()];
                }
            }

            // Push current index onto stack
            stack.push(idx);
        }

        return ans;
    }
}


//A standard stack follows Last-In-First-Out (LIFO) without any ordering constraints on its elements.
//
//A monotonic stack maintains its elements in a strictly increasing or decreasing order by popping elements that violate the condition during pushes.