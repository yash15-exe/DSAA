package Interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        if (intervals.length == 0 && newInterval.length == 0)
            return ans.toArray(new int[0][]);
        if (intervals.length == 0 && newInterval.length != 0)
            return new int[][] { newInterval };

        boolean isNewIntervalAdded = false;

        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][1] < newInterval[0]) {
                ans.add(intervals[i]);
            }

            else if (intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }

            else {
                if (!isNewIntervalAdded) {
                    ans.add(newInterval);
                    isNewIntervalAdded = true;
                }
                ans.add(intervals[i]);
            }
        }

        if (!isNewIntervalAdded)
            ans.add(newInterval);

        return ans.toArray(new int[ans.size()][]);
    }
}
