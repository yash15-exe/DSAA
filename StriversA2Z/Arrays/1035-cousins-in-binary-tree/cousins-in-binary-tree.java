class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode xParent = null;
            TreeNode yParent = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    if (node.left.val == x) xParent = node;
                    if (node.left.val == y) yParent = node;
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    if (node.right.val == x) xParent = node;
                    if (node.right.val == y) yParent = node;
                    queue.offer(node.right);
                }
            }

            if (xParent != null && yParent != null) {

                return xParent != yParent;
            }

            if ((xParent != null && yParent == null) || (xParent == null && yParent != null)) {
                return false;
            }
        }

        return false;
    }
}
