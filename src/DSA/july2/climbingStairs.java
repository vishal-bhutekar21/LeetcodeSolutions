package DSA.july2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class climbingStairs {

    // Global map to persist cached results across recursive calls for ways2
    static Map<Integer, Integer> map = new HashMap<>();

    static int ways1(int n){
        if(n==0) return 0;
        if (n==1) return 1;
        if(n==2) return 2;

        int a=1;
        int b=2;
        int count =0;
        for (int i=2;i<n;i++){
            count =a+b;
            a=b;
            b=count;
        }
        /*
         * TIME COMPLEXITY: O(n) - The loop runs exactly (n - 2) times.
         * SPACE COMPLEXITY: O(1) - Uses a constant amount of extra space (variables a, b, count).
         */
        return count;
    }

    static int ways2(int n){
        if(n==0) return 0;
        if (n==1) return 1;
        if(n==2) return 2;

        // Corrected: Checked against the global persisted map
        if(map.containsKey(n)){
            return map.get(n);
        }

        // Corrected: Both recursive calls now target ways2
        int result = ways2(n-1) + ways2(n-2);
        map.put(n, result);

        /*
         * TIME COMPLEXITY: O(n) - Each state from 3 to n is computed exactly once due to lookup.
         * SPACE COMPLEXITY: O(n) - O(n) for the recursion call stack + O(n) for the HashMap storage.
         */
        return result;
    }

    // Alternative: Classic Bottom-Up Dynamic Programming (Tabulation) using an Array
    static int ways3(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Create an array to store results of subproblems
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // Fill the array iteratively
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        /*
         * TIME COMPLEXITY: O(n) - Single loop running from 3 to n.
         * SPACE COMPLEXITY: O(n) - Allocates an array of size n + 1 to store computations.
         */
        //
        // System.out.println("dp of 0 location "+dp[0]);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Using HashMap := " + ways2(n));
        System.out.println("using the normal way " + ways1(n));
        System.out.println("Using DP Array (ways3) := " + ways3(n));
        sc.close();
    }
}