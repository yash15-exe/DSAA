import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i<3; i++){
            for(int j = 0; j < nums.length){
                if(nums[j] == i){
                    answer.add(i);
                }
            }
        }
        nums = answer.toArray(new Integer[0]);
    }
}