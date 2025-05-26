class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] badCount = new int[nums.length + 1];
        int count = 0;
        boolean[] ans = new boolean[queries.length];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]%2 == nums[i-1]%2)count++;
            badCount[i] = count;
        }
        int index = 0;
        for(int[] query: queries){
            if(badCount[query[0]] < badCount[query[1]])ans[index] = false;
            else ans[index] = true;
            index++;
        }
        return ans;
    }
}