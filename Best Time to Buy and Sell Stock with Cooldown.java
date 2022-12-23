// 309. Best Time to Buy and Sell Stock with Cooldown
// Medium
// 7.3K
// 244
// Companies
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

// After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

// Example 1:

// Input: prices = [1,2,3,0,2]
// Output: 3
// Explanation: transactions = [buy, sell, cooldown, buy, sell]
// Example 2:

// Input: prices = [1]
// Output: 0


class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        int prev = 0;
        for(final int price : prices){
            final int cache = sell;
            sell = Math.max(sell, hold + price);
            hold = Math.max(hold, prev - price);
            prev = cache;
        }
        return sell;
    }
}
