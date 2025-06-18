/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] max = new int[1]; 
        dfs(root, freqMap, max);

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == max[0]) {
                modes.add(entry.getKey());
            }
        }

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;
    }

    private void dfs(TreeNode node, Map<Integer, Integer> freqMap, int[] max) {
        if (node == null) return;

        freqMap.put(node.val, freqMap.getOrDefault(node.val, 0) + 1);
        max[0] = Math.max(max[0], freqMap.get(node.val));

        dfs(node.left, freqMap, max);
        dfs(node.right, freqMap, max);
    }
}
