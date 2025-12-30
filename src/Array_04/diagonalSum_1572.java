package Array_04;// https://leetcode.com/problems/matrix-diagonal-sum/description/
// File: diagonalSum_1572.java

/**
 * Problem: Matrix Diagonal Sum (LeetCode #1572)
 *
 * Given a square matrix mat of size n x n,
 * return the sum of the elements on the primary and secondary diagonals.
 *
 * If n is odd, the center element (which lies on both diagonals)
 * must be counted only once.
 */

public class diagonalSum_1572 {


    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal: (i, i)
            sum += mat[i][i];

            // Secondary diagonal: (i, n - 1 - i)
            // Avoid double-counting the center when n is odd
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }

    // Optional main method to run quick tests
    public static void main(String[] args) {
        diagonalSum_1572 sol = new diagonalSum_1572();

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Expected 25, Got: " + sol.diagonalSum(mat1));

        int[][] mat2 = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        System.out.println("Expected 16, Got: " + sol.diagonalSum(mat2));

        int[][] mat3 = {{5}};
        System.out.println("Expected 5, Got: " + sol.diagonalSum(mat3));
    }
}
