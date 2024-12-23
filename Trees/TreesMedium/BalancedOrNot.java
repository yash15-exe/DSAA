package Trees.TreesMedium;

public class BalancedOrNot {
    public boolean isBalanced(TreeNode root) {
        return findDepth(root) != -1;
    }

    public int findDepth(TreeNode root){
        if(root == null) return 0;

        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);
        if(leftDepth == -1|| rightDepth == -1)return -1;
        if(Math.abs(leftDepth-rightDepth)>1)return -1;
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
