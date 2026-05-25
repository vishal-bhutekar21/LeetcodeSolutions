package CodeForces.A_Level_Easy;

import java.util.*;

public class DivisiblePermutation2188A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {

        int n = sc.nextInt();

        int[] p = new int[n];

        for(int i = 0; i < n; i++) {
            p[i] = i + 1;
        }

        do {

            boolean ok = true;

            for(int i = 1; i < n; i++) {

                int diff = Math.abs(p[i - 1] - p[i]);

                if(diff % i != 0) {
                    ok = false;
                    break;
                }
            }

            if(ok) {

                for(int x : p) {
                    System.out.print(x + " ");
                }

                System.out.println();
                return;
            }

        } while(nextPermutation(p));
    }

    static boolean nextPermutation(int[] a) {

        int i = a.length - 2;

        while(i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }

        if(i < 0) {
            return false;
        }

        int j = a.length - 1;

        while(a[j] <= a[i]) {
            j--;
        }

        swap(a, i, j);

        reverse(a, i + 1, a.length - 1);

        return true;
    }

    static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverse(int[] a, int l, int r) {

        while(l < r) {

            swap(a, l, r);

            l++;
            r--;
        }
    }
}