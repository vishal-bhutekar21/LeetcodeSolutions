package conditional_loops_03;

import java.util.Scanner;

public class Reverse_integer_09 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to ger reverse");
        int num= sc.nextInt();
        int rev= reverse(num);
        System.out.println("The reverse number is "+rev);
    }
   static public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            rev = rev * 10 + digit;
        }
        return rev;
    }
}



