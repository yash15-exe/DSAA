package Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        if(intervals.length==0) return ans.toArray(new int[0][]);
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if(current[1]>=intervals[i][0]){
                current[1] = Math.max(intervals[i][1], current[1]);
            }
            else{
                ans.add(current);
                current = intervals[i];
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);


    }
}
