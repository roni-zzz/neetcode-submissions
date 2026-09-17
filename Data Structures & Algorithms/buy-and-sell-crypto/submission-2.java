class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = 100;
        int bestProfit = 0;
     	for (int i = 0; i < prices.length; i++) {
            if (prices[i] < bestBuy) {
                bestBuy = prices[i];
            }
            else {
                bestProfit = Math.max(bestProfit, prices[i] - bestBuy);
            }
        }
        return bestProfit;
        
    }
}
