import java.util.*;

class Solution {
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 1) queue.add(new int[]{i, 0});
            if (grid[i][cols - 1] == 1) queue.add(new int[]{i, cols - 1});
        }
        for (int j = 0; j < cols; j++) {
            if (grid[0][j] == 1) queue.add(new int[]{0, j});
            if (grid[rows - 1][j] == 1) queue.add(new int[]{rows - 1, j});
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];

            if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] != 1) continue;

            grid[x][y] = 0; 

            for (int[] dir : directions) {
                queue.add(new int[]{x + dir[0], y + dir[1]});
            }
        }

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) count++;
            }
        }

        return count;
    }
}
