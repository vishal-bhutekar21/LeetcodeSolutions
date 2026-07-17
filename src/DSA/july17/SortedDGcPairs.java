package DSA.july17;

import java.util.Arrays;

public class SortedDGcPairs {

    public static void main(String[] args) {

        SortedDGcPairs obj = new SortedDGcPairs();

        int[] nums = {2, 3, 4};

        long[] queries = {0, 1, 2};

        int[] ans = obj.gcdValues(nums, queries);

        System.out.println("Nums    : " + Arrays.toString(nums));
        System.out.println("Queries : " + Arrays.toString(queries));
        System.out.println("Answer  : " + Arrays.toString(ans));
    }

    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];
        for (int x : nums) {
            freq[x]++;
        }

        long[] gcdCount = new long[max + 1];

        for (int g = max; g >= 1; g--) {

            long cnt = 0;

            for (int multiple = g; multiple <= max; multiple += g) {
                cnt += freq[multiple];
            }

            long pairs = cnt * (cnt - 1) / 2;

            for (int multiple = g * 2; multiple <= max; multiple += g) {
                pairs -= gcdCount[multiple];
            }

            gcdCount[g] = pairs;
        }

        long[] prefix = new long[max + 1];
        for (int g = 1; g <= max; g++) {
            prefix[g] = prefix[g - 1] + gcdCount[g];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long k = queries[i] + 1;

            int l = 1;
            int r = max;

            while (l < r) {
                int mid = l + (r - l) / 2;

                if (prefix[mid] >= k) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }

            ans[i] = l;
        }

        return ans;
    }
}