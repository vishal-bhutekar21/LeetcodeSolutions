package CodeForces.TLE800;

import java.util.Scanner;

public class TargetPractice1873C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {

        int ans = 0;

        for (int i = 0; i < 10; i++) {
            String s = sc.next();

            for (int j = 0; j < 10; j++) {

                if (s.charAt(j) == 'X') {

                    int layer = Math.min(
                            Math.min(i, 9 - i),
                            Math.min(j, 9 - j)
                    );

                    ans += layer + 1;
                }
            }
        }

        System.out.println(ans);
    }
}