package DSA.july31;

import java.util.Scanner;

public class LinearSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Search(nums, 0, 18));

    }

    static boolean Search(int[] nums, int indx, int target) {
        if (indx == nums.length) {
            return false;
        }
        return nums[indx] == target || Search(nums, indx + 1, target);
    }

}

