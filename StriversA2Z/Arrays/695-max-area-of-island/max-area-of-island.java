class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int[] dRow ={-1, 1, 0, 0}; 
        int[] dCol ={0, 0, -1, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = 0;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int row = cell[0];
                        int col = cell[1];
                        area++;

                        for (int k = 0; k < 4; k++) {
                            int newRow = row + dRow[k];
                            int newCol = col + dCol[k];
                            if (newRow >= 0 && newRow < m &&
                                newCol >= 0 && newCol < n &&
                                grid[newRow][newCol] == 1 &&
                                !visited[newRow][newCol]) {
                                
                                q.add(new int[]{newRow, newCol});                                
                                visited[newRow][newCol] = true;
                            }
                        }
                    }
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }
}
