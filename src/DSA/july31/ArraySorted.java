package DSA.july31;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySorted {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(finAllelements(nums, 0, 18, new ArrayList<>()));
        System.out.println(isSorted(nums, 0));

    }

    static boolean isSorted(int[] nums, int ind) {
        if (ind == nums.length - 1) {
            return true;
        }
        return nums[ind] < nums[ind + 1] && isSorted(nums, ind + 1);
    }

    static ArrayList<Integer> finAllelements(int[] nums, int ind, int target, ArrayList<Integer> list) {
        if (ind == nums.length) {
            return list;
        }
        if (nums[ind] == target) {
            list.add(ind);
        }
        return finAllelements(nums, ind + 1, target, list);
    }

}
