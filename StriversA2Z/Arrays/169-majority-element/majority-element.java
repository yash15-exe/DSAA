import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for(int i: nums){
            if(count==0){
            candidate = i;
            count++;}
            else{
                if(candidate == i)count++;
                else count--;
            }
        }
        return candidate;
    }
}