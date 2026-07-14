package DSA.july13;

import java.math.BigInteger;
import java.util.Scanner;

public class multiplyStrings {
    static String multiply(String num1, String num2) {
        BigInteger num11 = new BigInteger(num1);
        BigInteger num22 = new BigInteger(num2);

        BigInteger ans = num11.multiply(num22);

        return ans.toString();

    }

    static String multiplyUsingcharminuse(String num1, String num2) {
        // Edge cases: multiplication by 0 or 1
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if ("1".equals(num1)) return num2;
        if ("1".equals(num2)) return num1;

        int m = num1.length();
        int n = num2.length();

        // The maximum possible length of the product is m + n
        int[] result = new int[m + n];

        // Flow: Multiply each digit from right to left
        for (int i = m - 1; i >= 0; i--) {
            // Convert character to integer using 'char - '0''
            int d1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                // Product of current digits plus any existing value/carry at this position
                int product = d1 * d2 + result[i + j + 1];

                // Update the current position with the single digit (modulo 10)
                result[i + j + 1] = product % 10;

                // Carry over the tens digit to the preceding position (i + j)
                result[i + j] += product / 10;
            }
        }

        // Convert the integer array back into a final String output
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros if the first position didn't receive a carry
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("multiplication is " + multiply(s1, s2));

    }
}
//https://leetcode.com/problems/multiply-strings/