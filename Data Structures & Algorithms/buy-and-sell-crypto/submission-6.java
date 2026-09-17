//Walk through each day. Keep track of the cheapest price you've seen so far. On any day that isn't a new cheapest day, pretend you sell — and check if that's the best profit yet.

class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = 100;
        int bestProfit = 0;
     	for (int i = 0; i < prices.length; i++) {
            if (prices[i] < bestBuy) {
                bestBuy = prices[i];
            }
            else {
                int profit = prices[i] - bestBuy;
                if (profit > bestProfit) {
                    bestProfit = profit;
                }
            }
        }
        return bestProfit;
        
    }
}
