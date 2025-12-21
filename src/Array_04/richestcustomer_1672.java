package Array_04;

public class richestcustomer_1672 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2, 4, 5, 6}
        };

        System.out.println(
                "The maximum sum of the richest customer wealth is "
                        + maximumWealth(arr)
        );
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
