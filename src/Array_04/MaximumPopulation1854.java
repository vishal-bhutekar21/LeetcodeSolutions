package Array_04;

import java.util.Arrays;
//https://leetcode.com/problems/maximum-population-year/description/
public class MaximumPopulation1854 {

    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];   // covers 1950..2050

        for (int[] log : logs) {
            years[log[0] - 1950]++;   // +1 at birth year
            years[log[1] - 1950]--;   // -1 at death year (not counted)
        }

        int maxYear = 1950;
        int maxPop = 0;
        int curr = 0;

        for (int i = 0; i < 101; i++) {
            curr += years[i];
            if (curr > maxPop) {
                maxPop = curr;
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {

        MaximumPopulation1854 solver = new MaximumPopulation1854();

        int[][] logs1 = { {1993, 1999}, {2000, 2010} };
        int[][] logs2 = { {1950, 1961}, {1960, 1971}, {1970, 1981} };
        int[][] logs3 = { {1950, 1960}, {1955, 1970}, {1965, 2000}, {1970, 1980} };

        System.out.println(solver.maximumPopulation(logs1)); // 1993
        System.out.println(solver.maximumPopulation(logs2)); // 1960
        System.out.println(solver.maximumPopulation(logs3)); // 1965
    }
}
