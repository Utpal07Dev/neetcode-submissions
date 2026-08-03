class Solution {
    public int maxProfit(int[] prices) {
     
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;
        for(int x:prices){
            if(minPrice>x)minPrice = x;
            else{ 
                profit= x - minPrice;
            maxProfit=Math.max(profit,maxProfit);}
        }
        return maxProfit;
    }
}
