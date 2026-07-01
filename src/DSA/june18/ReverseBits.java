package DSA.june18;

import java.util.Scanner;

public class ReverseBits {

    public static void main(String[] args) {

        // Read an integer from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        /*
         * ---------------------------------------------------------
         * STEP 1 : Convert the decimal number into its binary form.
         * ---------------------------------------------------------
         *
         * Example:
         * n = 13
         *
         * Binary = 1101
         *
         * Integer.toBinaryString() converts the integer into a binary string.
         */

        String binary = Integer.toBinaryString(n);

        /*
         * ---------------------------------------------------------
         * STEP 2 : Make the binary string exactly 32 bits long.
         * ---------------------------------------------------------
         *
         * Why?
         * ----
         * Java integers are stored using 32 bits.
         *
         * Example:
         *
         * Binary of 13 is:
         *
         * 1101
         *
         * But internally Java stores it as:
         *
         * 00000000000000000000000000001101
         *
         * The Reverse Bits problem asks us to reverse ALL 32 bits,
         * not just the digits returned by toBinaryString().
         *
         * Therefore we add leading zeros until the length becomes 32.
         */

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        /*
         * ---------------------------------------------------------
         * STEP 3 : Reverse the complete 32-bit binary string.
         * ---------------------------------------------------------
         *
         * Example:
         *
         * Before:
         * 00000000000000000000000000001101
         *
         * After:
         * 10110000000000000000000000000000
         *
         * StringBuilder has a built-in reverse() method,
         * which makes reversing very easy.
         */

        String reversedBinary = new StringBuilder(binary)
                .reverse()
                .toString();

        /*
         * ---------------------------------------------------------
         * STEP 4 : Convert the reversed binary back into decimal.
         * ---------------------------------------------------------
         *
         * parseLong(binary, 2)
         *
         * The second parameter (2) tells Java that the string
         * is in Binary (Base 2).
         *
         * Why Long?
         * ---------
         * After reversing,
         * the decimal value may become larger than Integer.MAX_VALUE.
         *
         * Example:
         *
         * 11111111111111111111111111111111
         *
         * Decimal:
         * 4294967295
         *
         * int cannot store this value,
         * therefore we use long.
         */

        long answer = Long.parseLong(reversedBinary, 2);

        /*
         * ---------------------------------------------------------
         * STEP 5 : Print everything.
         * ---------------------------------------------------------
         */

        System.out.println("\nOriginal Binary  : " + binary);
        System.out.println("Reversed Binary : " + reversedBinary);
        System.out.println("Decimal Value   : " + answer);

        sc.close();
    }
}