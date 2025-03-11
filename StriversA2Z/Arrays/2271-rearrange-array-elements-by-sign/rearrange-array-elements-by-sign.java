class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length-1;i = i+2){
            while(nums[positive]<0){
                positive++;
            }
            while(nums[negative]>0){
                negative++;
            }
            ans[i]=nums[positive];
            ans[i+1]=nums[negative];
            positive++;
            negative++;
        }
        return ans;
    }
}