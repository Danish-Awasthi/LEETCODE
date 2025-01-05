class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            max=Math.max(cost,max);
            min=Math.min(prices[i],min);
        }
        return max;
    }
}