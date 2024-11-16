package Arrays.LeetcodeMedium;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        if(nums.length==1)return nums[0];
        for(int num: nums){
            if(elements.containsKey(num)){
                int curr = elements.get(num);
                elements.put(num, curr+1);
                if(curr+1>nums.length/2){
                    return num;
                }
            }
            else{
                elements.put(num, 1);
            }
        }

        return 0;
    }
}
