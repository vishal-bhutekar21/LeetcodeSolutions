package Array_04;
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class minCostToMoveChips_1217 {

    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        minCostToMoveChips_1217 solution = new minCostToMoveChips_1217();

        // Example test
        int[] position = {1, 2, 3};

        int result = solution.minCostToMoveChips(position);
        System.out.println("Minimum cost: " + result);
    }
}
