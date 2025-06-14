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
 //with stack implementation........
// class Solution {
//     int count = 0;
//     public int goodNodes(TreeNode root) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(root.val);
//         helper(root, stack);
//         return count;
        
//     }
//     public void helper(TreeNode root, Stack stack){
//         if(root == null)return;
//         if(root.val >= (int)stack.peek()){
//             stack.push(root.val);
//             count++;
//              helper(root.left, stack);
//         helper(root.right, stack);
//         stack.pop();
//         }
//         else{
//             helper(root.left, stack);
//             helper(root.right, stack);
//         }
       
//     }
// }

class Solution {
    int count = 0;

    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count;
    }

    private void helper(TreeNode node, int maxSoFar) {
        if (node == null) return;

        if (node.val >= maxSoFar) count++;

        helper(node.left, Math.max(maxSoFar, node.val));
        helper(node.right, Math.max(maxSoFar, node.val));
    }
}