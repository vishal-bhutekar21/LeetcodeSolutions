// https://leetcode.com/problems/matrix-diagonal-sum/description/
// File: diagonalSum_1572.java

/**
 * Problem: Matrix Diagonal Sum (LeetCode #1572)
 *
 * You are given a square matrix `mat` of size n x n.
 * The task is to calculate the sum of the values on its two diagonals:
 *  - Primary diagonal (from top-left to bottom-right)
 *  - Secondary diagonal (from top-right to bottom-left)
 *
 * Note: If n is odd, the center element is counted only once.
 */

public class Solution {

    /**
     * Returns the sum of the two diagonals of the matrix.
     * @param mat the input square matrix
     * @return the diagonal sum
     */
    public int diagonalSum(int[][] mat) {
        int n = mat.length; // size of the square matrix
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += mat[i][i];

            // Add secondary diagonal element if it's not the same as primary diagonal
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }

    /**
     * Example test cases to help verify solution.
     */
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Output (Expected 25): " + sol.diagonalSum(mat1));

        // Test Case 2
        int[][] mat2 = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        System.out.println("Output (Expected 16): " + sol.diagonalSum(mat2));

        // Test Case 3
        int[][] mat3 = {
                {5}
        };
        System.out.println("Output (Expected 5): " + sol.diagonalSum(mat3));
    }
}
