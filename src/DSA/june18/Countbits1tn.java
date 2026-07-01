// program to find the no of 1 bits in the number from 1 to n
package DSA.june18;

import java.util.Scanner;

public class Countbits1tn {

    // Function to count number of set bits (1s) in binary representation of n
    static int count1(int n) {
        int count = 0;

        // Keep checking bits until n becomes 0
        while (n != 0) {

            // Check if the last bit is 1
            if ((n & 1) == 1) {
                count++;
            }

            // Right shift n by 1 bit to process the next bit
            n >>= 1;
        }

        // Return total number of set bits
        return count;
    }

    // Function to return an array containing set bit counts from 0 to n
    static int[] countBits(int n) {

        // Create an array of size n+1 because we need answers for 0 to n
        int[] ans = new int[n + 1];

        // Calculate set bits for every number from 0 to n
        for (int i = 0; i <= n; i++) {

            // Store the number of set bits of i
            ans[i] = count1(i);
        }

        // Return the array
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Get the array containing bit counts
        int[] result = countBits(n);

        // Print the result array
        System.out.print("Output: ");

        for (int x : result) {
            System.out.print(x + " ");
        }


    }
}