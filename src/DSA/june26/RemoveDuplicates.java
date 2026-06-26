package DSA.june26;

import java.util.Arrays;

public class RemoveDuplicates{

    // Brute Force
    public static int removeDuplicatesBrute(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int[] temp = new int[nums.length];

        temp[0] = nums[0];
        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                temp[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }

    // Optimal
    public static int removeDuplicatesOptimal(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void printArray(int[] nums, int length) {

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original Array : " + Arrays.toString(arr1));

        int length1 = removeDuplicatesBrute(arr1);

        System.out.println("\nAfter Brute Force");
        System.out.println("Length : " + length1);
        printArray(arr1, length1);

        System.out.println("--------------------------------");

        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int length2 = removeDuplicatesOptimal(arr2);

        System.out.println("After Optimal");
        System.out.println("Length : " + length2);
        printArray(arr2, length2);
    }
}