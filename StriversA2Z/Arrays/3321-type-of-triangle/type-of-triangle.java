class Solution {
    public String triangleType(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2])return "none";
        for(int num: nums){
            set.add(num);
        }
        if(set.size()==1)return "equilateral";
        else if(set.size()==2)return "isosceles";
        else if(set.size()==3)return "scalene";
        else return "none";
    }
}