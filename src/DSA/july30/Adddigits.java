package DSA.july31;

public class Adddigits {

    static void main(String[] args) {

        int num = 1999999999;

        System.out.println("Original Number : " + num);

        // Method 1 : Repeatedly add digits (Iterative)
        System.out.println("Method 1 (Loop)        : " + addDigitsLoop(num));

        // Method 2 : Recursive
        System.out.println("Method 2 (Recursion)   : " + addDigitsRecursive(num));

        // Method 3 : Digital Root (Optimal)
        System.out.println("Method 3 (Math Formula): " + addDigitsMath(num));
    }

    // ==========================================================
    // Method 1 : Iterative
    // Keep calculating the sum of digits until it becomes
    // a single digit.
    //
    // Time Complexity : O(d * k)
    // d = number of digits
    // k = number of iterations
    // Space Complexity : O(1)
    // ==========================================================
    static int addDigitsLoop(int num) {

        while (num >= 10) {
            num = digitSum(num);
        }

        return num;
    }

    // Helper method to calculate sum of digits
    static int digitSum(int num) {

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    // ==========================================================
    // Method 2 : Recursive
    //
    // Base Case:
    // If number is already one digit, return it.
    //
    // Otherwise recursively calculate digit sum.
    //
    // Time Complexity : O(d * k)
    // Space Complexity : O(k) (Recursive Stack)
    // ==========================================================
    static int addDigitsRecursive(int num) {

        if (num < 10)
            return num;

        return addDigitsRecursive(digitSum(num));
    }

    // ==========================================================
    // Method 3 : Digital Root Formula (Optimal)
    //
    // Mathematical Property:
    //
    // Digital Root =
    //
    // 0                     if num == 0
    // 1 + (num - 1) % 9     otherwise
    //
    // Why?
    //
    // A number and the sum of its digits always have the same
    // remainder when divided by 9.
    //
    // Example:
    //
    // 9875
    // -> 9+8+7+5 = 29
    // -> 2+9 = 11
    // -> 1+1 = 2
    //
    // 9875 % 9 = 2
    //
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    // ==========================================================
    static int addDigitsMath(int num) {

        if (num == 0)
            return 0;

        return 1 + (num - 1) % 9;
    }
}