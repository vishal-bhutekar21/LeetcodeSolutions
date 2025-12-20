package Array_04;

import java.util.Arrays;

public class sumofArray1480 {



    static void main() {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("orifional array"+ Arrays.toString(arr));
        System.out.println("new sum array"+Arrays.toString(runningSum(arr)));
    }

        static public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i];
            }
            return nums;

    }

}
