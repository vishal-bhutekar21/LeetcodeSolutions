package CodeForces.TLE800;

import java.util.Scanner;

public class LineTrip1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxg = arr[0];

        for (int i = 1; i < n; i++) {
            maxg = Math.max(maxg, arr[i] - arr[i - 1]);
        }

        int lastGap = 2 * (x - arr[n - 1]);

        System.out.println(Math.max(maxg, lastGap));
    }
}