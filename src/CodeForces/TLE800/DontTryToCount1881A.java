package CodeForces.TLE800;

import java.util.Scanner;

public class DontTryToCount1881A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc));
        }
    }

    static int solve(Scanner sc) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        String x = sc.next();
        String s = sc.next();

        int operations = 0;

        for (int i = 0; i <= 6; i++) {

            if (x.contains(s)) {
                return operations;
            }

            x = x + x;
            operations++;
        }

        return -1;
    }
}