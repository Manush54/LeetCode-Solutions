class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, maxP = 0;
        
        while(r < prices.length){

            int profit;
            if(prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                if(profit > maxP)
                    maxP = profit;
            } else {
                l = r;
            }
            
            r++;
        }
        
        return maxP;
    }
}