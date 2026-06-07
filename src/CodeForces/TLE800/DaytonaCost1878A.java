package CodeForces.TLE800;

import java.util.Scanner;

public class DaytonaCost1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == k) {
                found = true;
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}