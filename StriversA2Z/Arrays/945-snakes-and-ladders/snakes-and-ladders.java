import java.util.*;

class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int k = 0; k < size; k++) {
                int curr = queue.poll();

                if (curr == n * n) return moves;

                for (int next = curr + 1; next <= Math.min(curr + 6, n * n); next++) {
                    int[] coords = getCoordinates(next, n);
                    int r = coords[0];
                    int c = coords[1];
                    
                    int dest = board[r][c] == -1 ? next : board[r][c];

                    if (!visited[dest]) {
                        visited[dest] = true;
                        queue.offer(dest);
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    public int[] getCoordinates(int pos, int n) {
        int row = (pos - 1) / n;
        int col = (pos - 1) % n;

        int actualRow = n - 1 - row; 

        if (row % 2 == 1) {
            col = n - 1 - col; 
        }

        return new int[] {actualRow, col};
    }
}
