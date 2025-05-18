class Solution {
    public int subarraySum(int[] nums, int k) {
        // int l = 0, r = 0, count = 0, sum = 0;
        // while(r < nums.length){
        //     sum += nums[r];
        //     while(sum > k && l < r){
        //         sum -= nums[l];
        //         l++;
        //     }
        //     if(sum == k)count++;
        //     r++;
        // }
        // return count;
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num: nums){
            sum += num;

            if(map.containsKey(sum - k)){
                count+=map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;

    }
}