import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]); 
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];

        List<Integer> topoSort = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, pathVisited, topoSort)) {
                    return new int[0];
                }
            }
        }

        Collections.reverse(topoSort);
        return topoSort.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean dfs(int node, Map<Integer, List<Integer>> adj,
                        boolean[] visited, boolean[] pathVisited, List<Integer> topoSort) {
        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, pathVisited, topoSort)) {
                    return true;
                }
            } else if (pathVisited[neighbor]) {
                return true;
            }
        }

        pathVisited[node] = false;
        topoSort.add(node);
        return false;
    }
}
