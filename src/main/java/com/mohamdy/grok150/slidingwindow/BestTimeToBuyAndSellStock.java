package com.mohamdy.grok150.slidingwindow;

/**
 * LeetCode 121. Best Time to Buy and Sell Stock &mdash; Easy
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://neetcode.io/problems/buy-and-sell-crypto/question">https://neetcode.io/problems/buy-and-sell-crypto/question</a>
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            int currentProfit = 0;
            int j = i + 1;
            while (j < prices.length) {
                currentProfit = prices[j] - prices[i];
                bestProfit = Math.max(bestProfit, currentProfit);
                j++;
            }
        }
        return bestProfit;

    }
}
