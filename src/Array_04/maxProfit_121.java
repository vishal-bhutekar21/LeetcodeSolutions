/*
 LeetCode Problem 121: Best Time to Buy and Sell Stock
 Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

 Time Complexity: O(n)
 Space Complexity: O(1)

 Explanation:
 - We use two pointers (buy and sell)
 - Traverse the array once
 - Track the minimum buying price and maximum profit
*/

public class maxProfit_121 {

    public static int maxProfit(int[] prices) {
        int l = 0;      // buy pointer
        int r = 1;      // sell pointer
        int max = 0;    // maximum profit

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            } else {
                l = r; // update buy pointer to lower price
            }
            r++;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}
