package Array_04;
//https://leetcode.com/problems/plus-one/
import java.util.Arrays;

public class Plusone_66 {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // If the digit is not 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If it is 9, it becomes 0 and we carry to the next digit
            digits[i] = 0;
        }

        // If all digits were 9, we need a bigger array
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        Plusone_66 solver = new Plusone_66();

        int[] test1 = {1, 2, 3};
        int[] test2 = {4, 3, 2, 1};
        int[] test3 = {9};
        int[] test4 = {9, 9, 9};

        System.out.println(Arrays.toString(solver.plusOne(test1))); // [1, 2, 4]
        System.out.println(Arrays.toString(solver.plusOne(test2))); // [4, 3, 2, 2]
        System.out.println(Arrays.toString(solver.plusOne(test3))); // [1, 0]
        System.out.println(Arrays.toString(solver.plusOne(test4))); // [1, 0, 0, 0]
    }
}
