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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(index%2 == 0){
                    if(node.val%2 == 0)return false;
                    if(node.val<=max)return false;
                    max = node.val;
                }
                else{
                    if(node.val%2 != 0)return false;
                    if(node.val>=min)return false;
                    min = node.val;
                }
                if(node.left!=null)queue.add(node.left);
                if(node.right != null)queue.add(node.right);
                
                
            }
            index++;
        }
        return true;
    }
}