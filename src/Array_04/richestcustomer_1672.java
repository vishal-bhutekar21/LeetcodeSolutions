package Array_04;

import java.util.Scanner;

public class richestcustomer_1672 {
    public static void main(String ...args){
        Scanner sc=new Scanner(System.in);

        int arr[][]=push {{1,2,3,4,},{1,2,4,5,6}};

    }
    static public int maximumWealth(int[][] accounts) {
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
