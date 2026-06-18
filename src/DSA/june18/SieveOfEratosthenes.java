package DSA.june18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the upper limit
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Array to mark prime numbers
        boolean[] isPrime = new boolean[n + 1];

        // Initially assume all numbers are prime
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        if (n >= 0)
            isPrime[0] = false;
        if (n >= 1)
            isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {

            // If i is prime, mark its multiples as non-prime
            if (isPrime[i]) {

                // Start from i*i
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // ArrayList to store prime numbers
        ArrayList<Integer> primes = new ArrayList<>();

        // Add all prime numbers to ArrayList
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers from 1 to " + n + ":");
        System.out.println(primes);

    }
}