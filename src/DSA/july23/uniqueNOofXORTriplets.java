package DSA.july23;

import java.util.HashSet;

public class uniqueNOofXORTriplets {

    // ------------------------------------------------------------
    // Function 1 : Optimal Solution (O(1))
    // Observation:
    // 1. nums is a permutation of [1...n].
    // 2. If n < 3, only existing numbers can be formed.
    // 3. If n >= 3, answer is the next power of 2 greater than n.
    // ------------------------------------------------------------
    public static int optimal(int[] nums) {
        int n = nums.length;

        if (n < 3)
            return n;

        int ans = 1;
        while (ans <= n)
            ans <<= 1;

        return ans;
    }

    // ------------------------------------------------------------
    // Function 2 : Brute Force (O(n³))
    //
    // Try every valid triplet (i <= j <= k),
    // compute XOR and store in HashSet.
    //
    // Time  : O(n³)
    // Space : O(number of unique XOR values)
    // ------------------------------------------------------------
    public static int bruteForce(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                for (int k = j; k < n; k++) {

                    int xor = nums[i] ^ nums[j] ^ nums[k];
                    set.add(xor);

                }
            }
        }

        return set.size();
    }

    // ------------------------------------------------------------
    // Function 3 : Better Solution
    //
    // Observation:
    // XOR is associative.
    //
    // First compute XOR of every pair (i, j),
    // then XOR it with every k.
    //
    // This avoids computing the first XOR repeatedly.
    //
    // Time  : O(n³)
    // Space : O(unique XOR values)
    //
    // (Not asymptotically faster, but cleaner and
    // demonstrates precomputation.)
    // ------------------------------------------------------------
    public static int better(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int pairXor = nums[i] ^ nums[j];

                for (int k = j; k < n; k++) {

                    set.add(pairXor ^ nums[k]);

                }
            }
        }

        return set.size();
    }

    // ------------------------------------------------------------
    // Driver Code
    // ------------------------------------------------------------
    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 1, 2};

        System.out.println("Array 1:");
        System.out.println("Brute Force : " + bruteForce(nums1));
        System.out.println("Better      : " + better(nums1));
        System.out.println("Optimal     : " + optimal(nums1));

        System.out.println();

        System.out.println("Array 2:");
        System.out.println("Brute Force : " + bruteForce(nums2));
        System.out.println("Better      : " + better(nums2));
        System.out.println("Optimal     : " + optimal(nums2));
    }
}