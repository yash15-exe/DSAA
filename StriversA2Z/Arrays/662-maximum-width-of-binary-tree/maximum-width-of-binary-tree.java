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
    class NodeIndex {
        TreeNode node;
        int index;
        NodeIndex(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;
        Queue<NodeIndex> queue = new LinkedList<>();
        queue.add(new NodeIndex(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            int minIndex = queue.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                NodeIndex current = queue.poll();
                int currIndex = current.index - minIndex; // normalized index

                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;

                if (current.node.left != null)
                    queue.add(new NodeIndex(current.node.left, 2 * currIndex));
                if (current.node.right != null)
                    queue.add(new NodeIndex(current.node.right, 2 * currIndex + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}

