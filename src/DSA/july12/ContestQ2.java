package DSA.july12;

import java.util.Scanner;

public class ContestQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        System.out.println("minimum distance is " + minimumCost(nums, k));
    }

    static int minimumCost(int[] nums, int k) {

        int n = nums.length;

        return 0;
    }
}
