import java.util.Arrays;
import java.util.PriorityQueue;
public class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] arrival = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arrival[i], Integer.MAX_VALUE);
        }
        arrival[0][0] = 0;
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[]{0, 0, 0});
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int time = current[0];
            int i = current[1];
            int j = current[2];
            
            if (i == n - 1 && j == m - 1) {
                return time;
            }
            
            if (time > arrival[i][j]) {
                continue;
            }
            
            for (int[] dir : directions) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    int required = moveTime[x][y];
                    int departure = Math.max(time, required);
                    int newTime = departure + 1;
                    if (newTime < arrival[x][y]) {
                        arrival[x][y] = newTime;
                        heap.offer(new int[]{newTime, x, y});
                    }
                }
            }
        }
        
        return arrival[n - 1][m - 1];
    }
}