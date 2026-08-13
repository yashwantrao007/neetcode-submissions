class Solution {
    public int maxProfit(int[] prices) {

        int smallest = prices[0];
        int MaxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            MaxProfit = Math.max(MaxProfit, prices[i]-smallest);

            if(prices[i]<smallest){
                smallest = prices[i];
            }
        }

        return MaxProfit<=0? 0 : MaxProfit;
        

        
    }
}
