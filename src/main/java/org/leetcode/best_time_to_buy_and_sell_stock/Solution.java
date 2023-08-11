package org.leetcode.best_time_to_buy_and_sell_stock;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        MaxProfitValues maxProfitValues = new MaxProfitValues();

        maxProfitValues.possibleMaxProfitValue1 = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int possibleMaxProfit = prices[i] - maxProfitValues.possibleMaxProfitValue1;
            if (possibleMaxProfit > maxProfit) {
                maxProfit = possibleMaxProfit;
                maxProfitValues.value1 = maxProfitValues.possibleMaxProfitValue1;
                maxProfitValues.value2 = prices[i];
            } else if (prices[i] < maxProfitValues.possibleMaxProfitValue1) {
                maxProfitValues.possibleMaxProfitValue1 = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}

class MaxProfitValues {
    int value1;
    int value2;
    int possibleMaxProfitValue1;
}
