package Array_04;

import java.util.Arrays;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates26 {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int k = 1;  // index for next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // found a new unique value
                nums[k] = nums[i];        // place it at index k
                k++;
            }
        }

        return k;  // number of unique elements
    }

    public static void main(String[] args) {

        RemoveDuplicates26 solver = new RemoveDuplicates26();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = solver.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.println("Modified array = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
