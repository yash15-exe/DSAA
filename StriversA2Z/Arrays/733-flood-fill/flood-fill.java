class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int original = image[sr][sc];
        
        if (original == color) return image;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        image[sr][sc] = color;

        int[] dr ={-1, 1, 0, 0}; 
        int[] dc ={0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1 ];

            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];
                if (newRow < 0 ||
                    newRow >= m ||
                    newCol < 0 ||
                    newCol >= n ||
                    image[newRow][newCol] == color ||
                    image[newRow][newCol] != original) {
                    continue;
                }
                image[newRow][newCol] = color;
                queue.add(new int[]{newRow, newCol}); 
            }
        }

        return image;
    }
}
