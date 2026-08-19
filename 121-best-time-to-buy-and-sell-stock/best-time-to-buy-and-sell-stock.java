class Solution {
    public int maxProfit(int[] prices) {
        int minProfit = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int cost = prices[i] - minProfit;
            maxProfit = Math.max(maxProfit,cost);
            minProfit = Math.min(minProfit,prices[i]);
        }
        return maxProfit;
    }
}