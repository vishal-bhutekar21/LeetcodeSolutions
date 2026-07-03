package DSA.july3;

public class SearchInsert {

    // Method 1: Two-pass Linear Search
    static int searchInsert1(int[] nums, int target) {

        int pos = nums.length;

        // Check if target exists
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        // Find insertion position
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    // Method 2: One-pass Linear Search (Better)
    static int searchInsert2(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        System.out.println(searchInsert1(nums, 5)); // 2
        System.out.println(searchInsert1(nums, 2)); // 1
        System.out.println(searchInsert1(nums, 7)); // 4
        System.out.println(searchInsert1(nums, 0)); // 0

        System.out.println();

        System.out.println(searchInsert2(nums, 5)); // 2
        System.out.println(searchInsert2(nums, 2)); // 1
        System.out.println(searchInsert2(nums, 7)); // 4
        System.out.println(searchInsert2(nums, 0)); // 0
    }
}