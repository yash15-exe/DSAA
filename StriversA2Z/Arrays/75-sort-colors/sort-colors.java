class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length-1, i = 0;
        while(i <= r){
            if(nums[i]==2){
                swap(nums, i, r);
                r--;
            }
            else if(nums[i]==0){
                swap(nums, i, l);
                l++;
                i++;
            }
            else{
                i++;
            }
        }
        
    }
    

    // Helper method to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
