import java.util.*;

public class Solution {
    private void findNodes(int src, List<List<Integer>> adj, boolean[] vis, int[] nodesApart, int distance, int k) {
        vis[src] = true;
        if (distance <= k) {
            nodesApart[0]++;
        }
        for (int neighbor : adj.get(src)) {
            if (!vis[neighbor]) {
                findNodes(neighbor, adj, vis, nodesApart, distance + 1, k);
            }
        }
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = edges1.length, m = edges2.length;
        int size1 = n + 1;
        int size2 = m + 1;

        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i <= size1; i++) adj1.add(new ArrayList<>());
        for (int i = 0; i <= size2; i++) adj2.add(new ArrayList<>());

        for (int[] edge : edges1) {
            int u = edge[0], v = edge[1];
            adj1.get(u).add(v);
            adj1.get(v).add(u);
        }

        for (int[] edge : edges2) {
            int u = edge[0], v = edge[1];
            adj2.get(u).add(v);
            adj2.get(v).add(u);
        }

        int[] maxTargetNodes = new int[size1];
        int[] nodesApart1 = new int[size1];
        int[] nodesApart2 = new int[size2];

        for (int i = 0; i < size1; i++) {
            boolean[] vis = new boolean[size1];
            int[] count = new int[1];
            findNodes(i, adj1, vis, count, 0, k);
            nodesApart1[i] = count[0];
        }

        for (int i = 0; i < size2; i++) {
            boolean[] vis = new boolean[size2];
            int[] count = new int[1];
            findNodes(i, adj2, vis, count, 0, k - 1);
            nodesApart2[i] = count[0];
        }

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                maxTargetNodes[i] = Math.max(maxTargetNodes[i], nodesApart1[i] + nodesApart2[j]);
            }
        }

        return maxTargetNodes;
    }
}
