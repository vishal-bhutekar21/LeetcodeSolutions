package DSA.july18;

import java.util.Arrays;
import java.util.HashMap;

public class BinarySeach {
    static int binsearch(int[] nums, int k) {

        Arrays.sort(nums);
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (left < right) {
            mid = left + right / 2;
            if (nums[mid] == k)
                return mid;
            if (nums[mid] > k) {
                right = mid - 1;
            } else {
                left++;
            }
        }
        return -1;
    }

    static int searchHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
                
        if (map.containsKey(target)) {
            return map.get(target);
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{12, 214, 52, 523452, 63, 121, 634, 2};
        int k = 63;
        System.out.println("Binary Seach " + binsearch(nums, k));
    }
}
