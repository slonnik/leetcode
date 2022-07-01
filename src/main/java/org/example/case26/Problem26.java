package org.example.case26;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Problem26 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; ++i) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
