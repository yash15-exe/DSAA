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
     public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int size = stack.size();
            List<Integer> smallAns = new ArrayList<>();
            for (int i = 0; i < size; i++) {

            TreeNode newElement = stack.poll();
            if(newElement.left!=null)stack.add(newElement.left);
            if (newElement.right!=null)stack.add(newElement.right);
            smallAns.add(newElement.val);
            }
            ans.add(smallAns);
        }
        return ans;
     }
        
}