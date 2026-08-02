package DSA.August2;

import java.util.Scanner;

public class HalfPrymaid {

    static void pryamidNoRecursion(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pryamidNoRecursion(n);
    }

}
