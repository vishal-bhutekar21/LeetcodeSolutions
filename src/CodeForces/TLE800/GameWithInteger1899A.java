package CodeForces.TLE800;

import java.util.Scanner;

public class GameWithInteger1899A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int n = in.nextInt();

        if (n % 3 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}