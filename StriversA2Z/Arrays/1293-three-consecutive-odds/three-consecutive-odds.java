class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consec = 0;
        for(int i: arr){
            if(i%2==0){
                consec = 0;
                continue;
            }
            consec++;
            if(consec == 3)return true;
        }
        return false;
    }
}