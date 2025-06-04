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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }

        insert(root, val, depth, 1);
        return root;
    }

    private void insert(TreeNode node, int val, int depth, int currentDepth) {
        if (node == null) return;

        if (currentDepth == depth - 1) {
            TreeNode oldLeft = node.left;
            TreeNode oldRight = node.right;

            node.left = new TreeNode(val);
            node.left.left = oldLeft;

            node.right = new TreeNode(val);
            node.right.right = oldRight;
        } else {
            insert(node.left, val, depth, currentDepth + 1);
            insert(node.right, val, depth, currentDepth + 1);
        }
    }
}
