package CodeForces.TLE800;

import java.util.Scanner;

public class GolsOFVictory1877A {

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

        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }

        System.out.println(-sum);
    }
}