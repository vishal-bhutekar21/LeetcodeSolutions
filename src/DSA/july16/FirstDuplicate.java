package DSA.july16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstDuplicate {
    static int firstduplicate(int[] nums) {
        int duplicate = 0;

        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (set.contains(nums[i])) {
                return nums[i];

            } else {
                set.add(nums[i]);
            }

        }
        return -1;
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

        System.out.println("First duplicate is " + firstduplicate(nums));
        sc.close();
    }

    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length <= 1) {
            return false;
        }


        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
