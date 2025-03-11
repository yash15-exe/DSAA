package StriversA2Z.Arrays;

public class BestTimeToBuyStock {
    /*
Question ID: 121  (Replace with actual ID if available)
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Question: You are given an array `prices[]` where `prices[i]` represents the stock price on the `i-th` day.
You need to find the **maximum profit** that can be achieved by buying on one day and selling on another later day.
Note: You **cannot** sell before you buy.

Explanation:
- Initialize `minPrice` as the first day's price and `maxProfit` as 0.
- Iterate through the array:
  1. If the current price is lower than `minPrice`, update `minPrice` (buy at the lowest price).
  2. Otherwise, calculate `potentialProfit` by selling at the current price.
  3. Update `maxProfit` with the highest possible profit so far.
- Return the maximum profit found.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
*/

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                int potentialProfit = price - minPrice;
                maxProfit = Math.max(maxProfit, potentialProfit);
            }
        }
        return maxProfit;
    }

}
