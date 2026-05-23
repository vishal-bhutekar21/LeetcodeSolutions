package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class Team231A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        while (n-- > 0) {

            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            if (p + v + t >= 2) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}