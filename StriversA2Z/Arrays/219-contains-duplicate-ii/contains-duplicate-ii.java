class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                int lastIndex = hashMap.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true; 
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}