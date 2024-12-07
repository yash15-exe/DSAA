package Interval;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0) return ans;
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i<nums.length; i++){
            if(nums[i] == end+1){
                end = nums[i];

            }
            else{
                if(start==end) {
                    ans.add(String.valueOf(start));
                }else{
                    ans.add(String.valueOf(start)+"->"+String.valueOf(end));
                }
                start = nums[i];
                end = nums[i];
            }
        }
        if (start == end) {
            ans.add(String.valueOf(start));
        } else {
            ans.add(start + "->" + end);
        }
        return ans;
    }
}
