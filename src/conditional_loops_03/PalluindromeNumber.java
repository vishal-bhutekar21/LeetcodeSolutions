package conditional_loops_03;

import java.util.Scanner;

public class PalluindromeNumber {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));

    }
    static public boolean isPalindrome(int x) {

        // Negative numbers & numbers ending with 0 (except 0) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revHalf = 0;

        while (x > revHalf) {
            int digit = x % 10;
            revHalf = revHalf * 10 + digit;
            x /= 10;
        }

        // For even digits: x == revHalf
        // For odd digits: x == revHalf/10
        return (x == revHalf || x == revHalf / 10);
    }
}


