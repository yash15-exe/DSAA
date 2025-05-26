class Solution {
    public int heightChecker(int[] heights) {
        int[] counter = new int[105];
        for(int height: heights){
            counter[height]++;
        }
        int index = 0;
        int ans = 0;
        for(int i = 0; i < counter.length; i++){
            if(counter[i]==0)continue;
            while(counter[i]!=0){
                if(i != heights[index]){
                    ans++;
                }
                counter[i]--;
                index++;
            }
        }
        return ans;
    }
}