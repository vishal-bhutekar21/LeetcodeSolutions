package CodeForces.TLE800;

import java.util.Scanner;

public class CoverInWater1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();

        // Read the string
        String s = sc.next();

        boolean cothreeempty = false;
        int totalemptycells = 0;

        for (int i = 0; i < n; i++) {

            if (i + 2 < n &&
                    s.charAt(i) == '.' &&
                    s.charAt(i + 1) == '.' &&
                    s.charAt(i + 2) == '.') {

                cothreeempty = true;
                break;
            }

            if(s.charAt(i)=='.'){
                totalemptycells++;
            }
        }

        if (cothreeempty){
            System.out.println("2");
        }
        else {
            System.out.println(totalemptycells);
        }


    }
}