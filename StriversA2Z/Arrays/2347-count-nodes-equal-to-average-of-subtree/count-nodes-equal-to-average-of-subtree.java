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
    public int averageOfSubtree(TreeNode root) {
        int[] ans = helper(root);
        return ans[2];
    }
    //{count, sum, totalNodes}
    public int[] helper(TreeNode root){
        if(root == null)return new int[]{0, 0, 0};
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int sum = root.val + left[1] + right[1];
        int count = left[0] + right[0] + 1;
        int totalNodes = left[2]+right[2];
        if(sum/count == root.val)totalNodes++;
        return new int[]{count, sum, totalNodes};
    }
}