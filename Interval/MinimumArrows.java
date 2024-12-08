package Interval;

import java.util.Arrays;

public class MinimumArrows {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int minArrows = points.length;
        int i = 0;

        while(i < points.length){
            int j = i+1;
            while(j< points.length){
                if(points[j][0]<=points[i][1]){
                    j++;
                    minArrows--;
                }else{
                    break;
                }
            }
            i = j;
        }
        return minArrows;
    }
}
