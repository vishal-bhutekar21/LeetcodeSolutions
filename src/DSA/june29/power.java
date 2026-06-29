package DSA.june29;

import java.util.Scanner;

public class power {

    // ---------------- Brute Force ----------------
    // O(n)
    static double bruteForce(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double ans = 1;

        for (long i = 0; i < power; i++) {
            ans *= x;
        }

        return ans;
    }

    // ---------------- Recursive Binary Exponentiation ----------------
    // O(log n)
    static double recursive(double x, int n) {

        long power = n;

        if (power < 0) {
            return 1 / recursiveHelper(x, -power);
        }

        return recursiveHelper(x, power);
    }

    static double recursiveHelper(double x, long n) {

        if (n == 0)
            return 1;

        double half = recursiveHelper(x, n / 2);

        if (n % 2 == 0)
            return half * half;

        return x * half * half;
    }

    // ---------------- Iterative Binary Exponentiation (Optimal) ----------------
    // O(log n)
    static double optimal(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double ans = 1;

        while (power > 0) {

            if (power % 2 == 1)
                ans *= x;

            x *= x;
            power /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base : ");
        double x = sc.nextDouble();

        System.out.print("Enter Power : ");
        int n = sc.nextInt();

        System.out.println("\nBrute Force Answer : " + bruteForce(x, n));

        System.out.println("Recursive Answer   : " + recursive(x, n));

        System.out.println("Optimal Answer     : " + optimal(x, n));

        sc.close();
    }
}