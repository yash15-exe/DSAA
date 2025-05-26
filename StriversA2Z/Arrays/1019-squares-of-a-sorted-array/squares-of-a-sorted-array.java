class Solution {
    // public int[] sortedSquares(int[] nums) {
    //  for(int i = 0; i < nums.length; i++){
    //     nums[i] = nums[i] * nums[i];
    //  }   
    //  Arrays.sort(nums);
    //  return nums;
    // }

    public int[] sortedSquares(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int[] ans = new int[nums.length];
        int l = 0, r = nums.length-1;
        int index = nums.length - 1;
        while(l <= r){
            if(nums[l]>nums[r]){
                ans[index] = nums[l];
                l++;
            }
            else{
                ans[index] = nums[r];
                r--;
            }
            index--;
        }
        return ans;
    }
}