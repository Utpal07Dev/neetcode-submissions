class Solution {
    public int maxProfit(int[] prices) {
     
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int x:prices){
            minPrice=Math.min(minPrice,x);
            maxProfit=Math.max(x-minPrice,maxProfit);
        }
        return maxProfit;
    }
}
