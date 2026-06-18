package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class countdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();
        int c = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                c++;

                if (i != n / i) {
                    divisors.add(n / i);
                    c++;
                }

                /// it gives us the other divisor which reduces the time in
                ///  half
            }
        }

        Collections.sort(divisors);

        System.out.println("Count = " + c);
        System.out.println(divisors);
    }
}