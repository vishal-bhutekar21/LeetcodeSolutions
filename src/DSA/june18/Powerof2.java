package DSA.june18;

import java.util.Scanner;

public class Powerof2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Power of 2 must be positive and have exactly one set bit
        if (n > 0 && count1(n) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Counts number of 1s in binary representation
    static int count1(int n) {
        int count = 0;

        while (n != 0) {

            // If last bit is 1, increment count
            if ((n & 1) == 1) {
                count++;
            }

            // Remove last bit
            n >>= 1;
        }

        return count;
    }

    boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}