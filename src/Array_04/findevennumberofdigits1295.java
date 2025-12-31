package Array_04;

public class findevennumberofdigits1295 {

    public static int findNumbers(int[] nums) {
        int result = 0;

        for (int n : nums) {
            int digits = 0;
            int x = n;

            while (x != 0) {
                x /= 10;
                digits++;
            }

            if (digits % 2 == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums)); // Output: 2
    }
}
