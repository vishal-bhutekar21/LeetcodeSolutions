package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Printingdivisors1tn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        // Count divisors for every number from 1 to n
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                arr[j]++;
            }
        }

        // Store answers in ArrayList (skip index 0)
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(arr[i]);
        }

        System.out.println(ans);
    }
}