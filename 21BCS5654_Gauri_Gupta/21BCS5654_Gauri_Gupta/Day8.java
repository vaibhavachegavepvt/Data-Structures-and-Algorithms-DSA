📈 Best Time to Buy and Sell Stock II

LeetCode #122 | Greedy Algorithm

📝 Problem Statement

You are given an integer array prices where prices[i] represents the price of a stock on the i-th day.

You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times), with the following constraints:

You may not hold more than one stock at a time

You must sell before you buy again

Objective

Return the maximum profit you can achieve.

💡 Intuition

Instead of trying to find one best buy-sell pair, this problem allows multiple transactions.
So, the optimal strategy is:

Capture profit whenever there is an upward price movement.

Every time today’s price is higher than yesterday’s, we take that profit.
Adding all such profits results in the maximum possible gain.

🚀 Approach (Greedy)

Traverse the price array from day 1

If prices[i] > prices[i-1], add the difference to profit

Ignore price drops (no transaction on loss days)

This works because a series of small profitable transactions equals the maximum profit achievable.

🧮 Algorithm

Initialize profit = 0

Loop from index 1 to n-1

If prices[i] > prices[i-1], then
profit += prices[i] - prices[i-1]

Return profit

🧑‍💻 Java Implementation
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If there is a profit opportunity, take it
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}

⏱️ Time Complexity

O(n) — Single traversal of the array

💾 Space Complexity

O(1) — No extra space used
