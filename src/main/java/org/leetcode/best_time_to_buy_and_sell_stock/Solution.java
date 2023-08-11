package org.leetcode.best_time_to_buy_and_sell_stock;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int possibleMaxProfitValue1 = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int possibleMaxProfit = prices[i] - possibleMaxProfitValue1;
            if (possibleMaxProfit > maxProfit) {
                maxProfit = possibleMaxProfit;
            } else if (prices[i] < possibleMaxProfitValue1) {
                possibleMaxProfitValue1 = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
