package Array_04;

import java.util.Arrays;

public class arrayconcat_1929 {
    static void main(String[] args) {


        int arr[]={12,21,432,53245,6,432,2};
        System.out.println("origional array is"+Arrays.toString(arr));
        System.out.println("using the loops"+ Arrays.toString(getConcatenation(arr)));
        System.out.println("using the  fucntion of system.arraycopy"+Arrays.toString(getConcatenation1(arr)));

    }

        static public int[] getConcatenation1(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];

            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];  }


            return ans;
        }



       static public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];

            System.arraycopy(nums, 0, ans, 0, n);
            System.arraycopy(nums, 0, ans, n, n);

            return ans;

    }

}
