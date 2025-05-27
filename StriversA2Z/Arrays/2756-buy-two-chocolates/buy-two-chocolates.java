class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int price: prices){
            secondSmallest = Math.min(price, secondSmallest);
            if(secondSmallest < smallest){
                int temp = secondSmallest;
                secondSmallest = smallest;
                smallest = temp;
            }
        }
        int leftOver = money - (smallest+secondSmallest);
        if(leftOver >= 0) 
            return leftOver;
        else
            return money;
    }
}