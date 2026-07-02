package DSA.july2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

    // ---------------------------------------------------------
    // Approach 1 : Sorting + Frequency Counting (Better Approach)
    // Time Complexity  : O(n log n)
    // Space Complexity : O(1)
    // ---------------------------------------------------------
    static int majorityElementSorting(int[] nums) {

        int n = nums.length;
        int count = 1;

        if (n == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    // ---------------------------------------------------------
    // Approach 2 : HashMap Frequency Counting (Better Approach)
    // Time Complexity  : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    static int majorityElementHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int majority = arr.length / 2;

        // Store frequency
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Find majority element
        for (int key : map.keySet()) {

            if (map.get(key) > majority) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nUsing Sorting Approach : "
                + majorityElementSorting(arr.clone()));

        System.out.println("Using HashMap Approach : "
                + majorityElementHashMap(arr));

        sc.close();
    }
}