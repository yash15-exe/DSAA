class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPos = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)continue;
            while(nums[zeroPos]!=0&& zeroPos<i)zeroPos++;
            if(nums[zeroPos]==0){
                int temp = nums[i];
                nums[i] = nums[zeroPos];
                nums[zeroPos] = temp;
                
            }
        }
        
    }
}