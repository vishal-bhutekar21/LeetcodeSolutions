package DSA.july29;

import java.util.Scanner;

public class noOfSteps {

    static int no(int n) {
        return helper(n, 0);

    }

    static int step2(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;

            } else {
                n = n - 1;
            }

            count++;

        }
        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("no of steps" + step2(n));
        System.out.println("no of steps" + no(n));
    }

    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num /= 2, steps + 1);

        }
        return helper(num - 1, steps + 1);
    }
}

