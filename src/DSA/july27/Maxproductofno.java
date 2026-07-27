package DSA.july27;

import java.util.Arrays;
import java.util.Scanner;

public class Maxproductofno {

    static int maxProduct2(int[] nums) {
        int p = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                p = Math.max(p, (nums[i] - 1) * (nums[j] - 1));
            }
        }

        return p;
    }

    static int maxProduct1(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProduct2(arr));
        System.out.println(maxProduct1(arr));

        sc.close();
    }
}