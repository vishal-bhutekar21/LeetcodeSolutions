package Codechef_solutions;

import java.util.Scanner;

public class VariedNumber {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the two-digit number
        int x = sc.nextInt();

        // Convert the number into a character array
        // Example: 42 -> ['4', '2']
        char[] digits = String.valueOf(x).toCharArray();

        // Check if both digits are different
        if (digits[0] != digits[1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}