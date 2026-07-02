package DSA.july3;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;


        return fib(n - 1) + fib(n - 2);
    }

    static int fib2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0; // F(0)
        int b = 1; // F(1)
        int result = 0;


        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
    public int fib3(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int dp[] = new int[n + 1];

        dp[1]=0;
        dp[2]=1;

        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];

        }


    return dp[n];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println("using the normal :"+fib(x));
        System.out.println("using recursion :"+fib(x));
        System.out.println("using dp :"+fib(x));

    }
}
