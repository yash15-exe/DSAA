package Arrays.LeetcodeMedium;

public class BestBuy2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        while(i<prices.length-1){

            if(prices[i]<prices[i+1]){
                maxProfit+=prices[i+1]-prices[i];
            }
            i++;
        }
        return maxProfit;
    }
}
