class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;  // Buy day
        int right = 1; // Sell day
        int maxProfit = 0;

        while (right < prices.length) {
            // Is this a profitable trade?
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                // We found a new lower price! Update our buy day.
                left = right;
            }
            // Always move the sell day forward
            right++;
        }
        return maxProfit;
    }
}