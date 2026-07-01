package DSA.june18;

import java.math.BigInteger;
import java.util.Scanner;

public class GCDNumber {

    /*
     * ----------------------------------------------------------
     * Method 1 : Euclidean Algorithm (Recursion)
     * ----------------------------------------------------------
     *
     * Formula:
     * GCD(a, b) = GCD(b % a, a)
     *
     * Base Case:
     * If a becomes 0,
     * then b is the GCD.
     *
     * Example:
     * GCD(48,18)
     *
     * GCD(48,18)
     * = GCD(18,48%18)
     * = GCD(18,12)
     * = GCD(12,6)
     * = GCD(6,0)
     * = 6
     */

    static int gcdRecursive(int a, int b) {

        // Base Case
        if (a == 0)
            return b;

        // Recursive Call
        return gcdRecursive(b % a, a);
    }

    /*
     * ----------------------------------------------------------
     * Method 2 : Java Built-in Method
     * ----------------------------------------------------------
     *
     * Uses BigInteger's built-in gcd() function.
     */

    static int gcdBuiltIn(int a, int b) {

        return BigInteger.valueOf(a)
                .gcd(BigInteger.valueOf(b))
                .intValue();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("\nUsing Euclidean Algorithm : "
                + gcdRecursive(a, b));

        System.out.println("Using Built-in Method     : "
                + gcdBuiltIn(a, b));

        sc.close();
    }
}