package DSA.july16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {


    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }


        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }


        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];

        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            num2[i] = sc.nextInt();
        }
        System.out.println("the common intersection is " + intersection(num1, num2));
    }
}
//https://leetcode.com/problems/intersection-of-two-arrays/
