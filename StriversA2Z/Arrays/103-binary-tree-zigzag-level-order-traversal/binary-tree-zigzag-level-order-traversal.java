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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add((root));
        boolean leftToRight = true;

        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i<size; i++){
                TreeNode node = nodeQueue.peek();
                nodeQueue.poll();
                assert node != null;
                if (leftToRight) {
                    row.add(node.val);
                } else {
                    row.add(0, node.val);
                }
                if(node.left!=null)nodeQueue.add(node.left);
                if (node.right!=null)nodeQueue.add(node.right);


            }
            leftToRight = !leftToRight;
            result.add(row);
        }
        return result;
    }
}