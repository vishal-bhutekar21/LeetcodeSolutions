package DSA.july20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
LeetCode 1260. Shift 2D Grid
https://leetcode.com/problems/shift-2d-grid/

Time Complexity:
Brute Force : O(k * m * n)
Optimal     : O(m * n)

Space Complexity:
Brute Force : O(1) (excluding output)
Optimal     : O(m * n)
*/

public class shift2dgrid {

    // ---------------------- Brute Force ----------------------
    // Perform one shift exactly k times.
    public static List<List<Integer>> bruteForce(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        while (k-- > 0) {

            int[][] temp = new int[m][n];

            // Move every element to its next position
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    int ni = i;
                    int nj = j + 1;

                    if (nj == n) {
                        nj = 0;
                        ni++;
                    }

                    if (ni == m) {
                        ni = 0;
                    }

                    temp[ni][nj] = grid[i][j];
                }
            }

            grid = temp;
        }

        return convert(grid);
    }

    // ---------------------- Optimal ----------------------
    public static List<List<Integer>> optimal(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        int[][] shifted = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int currIndex = i * n + j;
                int newIndex = (currIndex + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                shifted[newRow][newCol] = grid[i][j];
            }
        }

        return convert(shifted);
    }

    // Convert int[][] -> List<List<Integer>>
    public static List<List<Integer>> convert(int[][] grid) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] rowArr : grid) {
            List<Integer> row = new ArrayList<>();
            for (int val : rowArr) {
                row.add(val);
            }
            ans.add(row);
        }

        return ans;
    }

    // Utility to print answer
    public static void print(List<List<Integer>> grid) {
        for (List<Integer> row : grid) {
            System.out.println(row);
        }
    }

    // Utility to copy grid
    public static int[][] copyGrid(int[][] grid) {
        int[][] copy = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            copy[i] = grid[i].clone();
        }

        return copy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter cols: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter grid:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[][] grid1 = copyGrid(grid);
        int[][] grid2 = copyGrid(grid);

        System.out.println("\nBrute Force:");
        print(bruteForce(grid1, k));

        System.out.println("\nOptimal:");
        print(optimal(grid2, k));

        sc.close();
    }
}