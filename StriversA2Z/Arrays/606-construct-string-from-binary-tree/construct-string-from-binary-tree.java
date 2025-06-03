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
class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        return dfs(root);
    }

    private String dfs(TreeNode node) {
        if (node == null) return "";

        StringBuilder sb = new StringBuilder();
        sb.append(node.val);

        if (node.left != null || node.right != null) {
            sb.append("(").append(dfs(node.left)).append(")");
        }

        if (node.right != null) {
            sb.append("(").append(dfs(node.right)).append(")");
        }

        return sb.toString();
    }
}
