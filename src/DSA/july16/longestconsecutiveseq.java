package DSA.july16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class longestconsecutiveseq {

    static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int currentLen = 1;
        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }

        maxLen = Math.max(maxLen, currentLen);

        return maxLen;
    }


    static int longestSequsinghashset(int[] nums) {


        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();


        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;


        for (int num : set) {


            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLen = 1;


                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Longeest Sequence length is " + longestConsecutive(nums));
        System.out.println("Longeest Sequence using hasmap is " + longestSequsinghashset(nums));
    }
}
