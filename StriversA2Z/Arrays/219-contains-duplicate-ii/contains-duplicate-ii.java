class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Set<Integer> set=new HashSet<>();
        int l=0;
        int r=0;
        while(r<nums.length)
        {
            if((r-l)<=k)
            {
                if(!set.add(nums[r]))
                {
                    return true;
                }
                r++;
            }
            else
            {
                set.remove(nums[l]);
                l++;
            }
        }
        return false;
    }
}