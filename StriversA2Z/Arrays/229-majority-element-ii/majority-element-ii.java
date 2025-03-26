class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        if(nums.length==0)return ans;
        int count = 0, prev = nums[0];
        boolean added = false;
        for(int i: nums){
            if(i == prev){
                count++;
                
            }
            else{
                count = 1;
                added = false;
            }
            if(count>Math.floor(nums.length/3)  && !added){
                ans.add(i);
                added = true;
            }
            prev = i;
            
        }
        return ans;
    }
}