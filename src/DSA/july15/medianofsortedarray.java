package DSA.july15;

import java.util.Arrays;
import java.util.Scanner;

public class medianofsortedarray {

    static double medianArray(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, ans, 0, nums1.length);

        System.arraycopy(nums2, 0, ans, nums1.length, nums2.length);

        Arrays.sort(ans);

        double media = 0;
        int n = ans.length;
        if (n % 2 != 0) {
            media = ans[n / 2];
        } else {
            media = (ans[n / 2] + ans[n / 2 - 1]) / 2.0;
        }


        return media;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            num2[i] = sc.nextInt();
        }


        System.out.println("median of array is " + medianArray(num1, num2));
    }
}
//https://leetcode.com/problems/median-of-two-sorted-arrays/
