package DSA.june18;

import java.util.Scanner;

public class DecimalToBinary {

    /*
     * ----------------------------------------------------------
     * Method 1 : Convert Decimal to Binary using Recursion
     * ----------------------------------------------------------
     * Idea:
     * Keep dividing the number by 2 until it becomes 0.
     * While returning from recursion, print the remainder (0 or 1).
     *
     * Example:
     * n = 13
     *
     * 13 -> 6 -> 3 -> 1 -> 0
     *
     * While returning:
     * 1 1 0 1
     *
     * Output = 1101
     */
    static void toBinary(int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        // Recursive Call
        toBinary(n / 2);

        // Print remainder
        System.out.print(n % 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        // Store original value because n will change later
        int original = n;

        /*
         * ==========================================================
         * Method 1 : Using Bitwise Operators (Output in Reverse)
         * ==========================================================
         *
         * We repeatedly extract the last bit using:
         *
         *      n & 1
         *
         * and remove the last bit using:
         *
         *      n >>= 1
         *
         * Example:
         *
         * n = 13
         *
         * Binary = 1101
         *
         * Iteration:
         *
         * 13 & 1 = 1
         * 6  & 1 = 0
         * 3  & 1 = 1
         * 1  & 1 = 1
         *
         * Output:
         * 1011
         *
         * This is reverse order.
         */

        System.out.print("\nBinary in Reverse Order : ");

        int temp = original;

        while (temp > 0) {

            System.out.print(temp & 1);

            // Right shift by 1
            temp >>= 1;
        }

        /*
         * ==========================================================
         * Method 2 : Using StringBuilder
         * ==========================================================
         *
         * Store bits in reverse order.
         * Finally reverse the string.
         */

        StringBuilder sb = new StringBuilder();

        temp = original;

        while (temp > 0) {

            // Store last bit
            sb.append(temp & 1);

            // Remove last bit
            temp >>= 1;
        }

        System.out.println("\nBinary using StringBuilder : " + sb.reverse());

        /*
         * ==========================================================
         * Method 3 : Using Recursion
         * ==========================================================
         */

        System.out.print("Binary using Recursion    : ");

        if (original == 0) {
            System.out.print(0);
        } else {
            toBinary(original);
        }

        /*
         * ==========================================================
         * Method 4 : Java Built-in Method
         * ==========================================================
         */

        System.out.println("\nBinary using Built-in     : "
                + Integer.toBinaryString(original));

        sc.close();
    }
}