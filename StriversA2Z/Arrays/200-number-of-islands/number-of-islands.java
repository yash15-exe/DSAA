import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int islandCount = 0;
        int rows = grid.length, cols = grid[0].length;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if (grid[i][j] == '1') {
                    islandCount++;
                    bfs(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    
    private void bfs(char[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        grid[i][j] = '0'; 

        
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];

            for (int[] d : directions) {
                int newX = x + d[0];
                int newY = y + d[1];

                
                if (newX >= 0 && newX < rows &&
                    newY >= 0 && newY < cols &&
                    grid[newX][newY] == '1') {
                    
                    queue.offer(new int[] {newX, newY});
                    grid[newX][newY] = '0'; 
                }
            }
        }
    }
}
