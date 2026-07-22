package Recursion;

import java.util.Scanner;

public class binaryserachusinrecursion {
    static int binarysearhc(int[] nums, int t, int s, int e) {

        if (s > e) {
            return -1;   // Target not found
        }
        
        int mid = s + (e - s) / 2;
        if (nums[mid] == t) {
            return mid;
        }
        if (nums[mid] > t) {
            return binarysearhc(nums, t, s, mid - 1);
        }
        return binarysearhc(nums, t, mid + 1, e);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("binary search  : " + binarysearhc(nums, 200, 0, nums.length - 1));
    }
}
