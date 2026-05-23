package Array_04;

import java.util.Arrays;

public class findThePrefixCommonArray_2657 {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 3, 5, 1, 4};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] ans1 = prefixCommonArray1(a, b);
        int[] ans2 = prefixCommonArray2(a, b);

        System.out.println("using Big(O3)   "+Arrays.toString(ans1));
        System.out.println("using Big(O2)    "+Arrays.toString(ans1));
    }

    private static int[] prefixCommonArray1(int[] a, int[] b) {

        int n = a.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int common = 0;

            for (int j = 0; j <= i; j++) {

                for (int k = 0; k <= i; k++) {

                    if (a[j] == b[k]) {
                        common++;
                        break;
                    }
                }
            }

            ans[i] = common;
        }

        return ans;
    }
    private static int[] prefixCommonArray2(int[] a, int[] b) {

        int n = a.length;

        int[] ans = new int[n];

        // marks whether number is seen or not
        boolean[] seen = new boolean[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            // process A[i]
            if (seen[a[i]]) {
                common++;
            } else {
                seen[a[i]] = true;
            }

            // process B[i]
            if (seen[b[i]]) {
                common++;
            } else {
                seen[b[i]] = true;
            }

            ans[i] = common;
        }

        return ans;
    }
}