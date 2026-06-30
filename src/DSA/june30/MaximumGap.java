package DSA.june30;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {

    static int[] maximumGap(int[] arr) {

        if (arr == null || arr.length < 2) {
            return new int[]{0};
        }

        Arrays.sort(arr);

        int maxGap = 0;
        int[] result = new int[3];

        for (int i = 1; i < arr.length; i++) {

            int gap = arr[i] - arr[i - 1];

            if (gap > maxGap) {
                maxGap = gap;
                result[0] = arr[i];      // larger element
                result[1] = arr[i - 1];  // smaller element
                result[2] = maxGap;      // maximum gap
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = maximumGap(arr);

        if (ans.length == 1) {
            System.out.println("Maximum gap: 0");
        } else {
            System.out.println("Maximum gap is " + ans[2]);
            System.out.println("Between elements " + ans[1] + " and " + ans[0]);
            System.out.println("Returned array: " + Arrays.toString(ans));
        }

        sc.close();
    }
}