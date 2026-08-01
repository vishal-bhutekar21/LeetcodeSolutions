package DSA.August1;

import java.util.*;

public class Threesome {

    // -------------------- Brute Force O(n^3) --------------------
    static List<List<Integer>> threeSumBrute(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] arr = {nums[i], nums[j], nums[k]};
                        Arrays.sort(arr);

                        set.add(Arrays.asList(arr[0], arr[1], arr[2]));
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    // -------------------- Better O(n^2) --------------------
    static List<List<Integer>> threeSumBetter(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> ans = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            HashSet<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = -(nums[i] + nums[j]);

                if (seen.contains(third)) {
                    ans.add(Arrays.asList(nums[i], third, nums[j]));
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }

    // -------------------- Optimal O(n^2) --------------------
    static List<List<Integer>> threeSumOptimal(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
            }
        }

        return ans;
    }

    // -------------------- Print Helper --------------------
    static void print(List<List<Integer>> ans) {
        for (List<Integer> triplet : ans) {
            System.out.println(triplet);
        }
    }

    // -------------------- Main --------------------
    static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println("Brute Force:");
        print(threeSumBrute(nums.clone()));

        System.out.println();

        System.out.println("Better (HashSet):");
        print(threeSumBetter(nums.clone()));

        System.out.println();

        System.out.println("Optimal (Two Pointers):");
        print(threeSumOptimal(nums.clone()));
    }
}