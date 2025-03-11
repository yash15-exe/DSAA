class Solution {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
       for(int price:prices){
            if(price<minPrice){
                minPrice = price;
            }else{
                int potentialProfit = price - minPrice;
               maxProfit = Math.max(maxProfit, potentialProfit);
            }
       }
       return maxProfit;
    }
}
