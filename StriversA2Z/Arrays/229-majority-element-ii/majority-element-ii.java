class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Arrays.sort(nums);
        // List<Integer> ans = new ArrayList<>();
        // if(nums.length==0)return ans;
        // int count = 0, prev = nums[0];
        // boolean added = false;
        // for(int i: nums){
        //     if(i == prev){
        //         count++;
                
        //     }
        //     else{
        //         count = 1;
        //         added = false;
        //     }
        //     if(count>Math.floor(nums.length/3)  && !added){
        //         ans.add(i);
        //         added = true;
        //     }
        //     prev = i;
            
        // }
        // return ans;

        int cnt1 = 0, cnt2 = 0, el1 = 0, el2 = 0;

        for(int i : nums){
            if(cnt1==0 && el2 != i){
                el1 = i;
                cnt1 = 1;
            }
            else if(cnt2 == 0 && el1 != i){
                el2 = i;
                cnt2 = 1;
            }
            else if(el1==i)cnt1++;
            else if(el2 == i)cnt2++;
            else {
                cnt1--;
                cnt2--;

            }
           
        }
         List<Integer> ans = new ArrayList<>();
            cnt1 = 0;
            cnt2 = 0;
            
            for(int j: nums){
                if(j == el1)cnt1++;
                else if(j==el2)cnt2++;
            }
            if(cnt1>Math.floor(nums.length/3))ans.add(el1);
            if(cnt2>Math.floor(nums.length/3))ans.add(el2);

            return ans;
    }
}