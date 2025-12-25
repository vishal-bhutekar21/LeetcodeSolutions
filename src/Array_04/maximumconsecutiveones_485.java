package Array_04;

public class maximumconsecutiveones_485 {

    public static void main(String[] args) {

        int arr[] = {0,1,0,0,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for (int n : nums) {
            if (n == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0; // reset when we hit a 0
            }
        }

        return max;
    }
}


//https://leetcode.com/problems/max-consecutive-ones
// solved using the
