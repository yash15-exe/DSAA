class Solution {
     public int removeElement(int[] nums, int val) {
    int j = nums.length - 1; 
    int i = 0;             

    while (i <= j) {
        if (nums[i] == val) {
            nums[i] = nums[j]; 
            j--;             
        } else {
            i++;            
        }
    }

    return j + 1; 
}

}