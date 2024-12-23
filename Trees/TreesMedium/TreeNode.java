package Trees.TreesMedium;

public class TreeNode {
    int val;
    Trees.TreesMedium.TreeNode left;
    Trees.TreesMedium.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, Trees.TreesMedium.TreeNode left, Trees.TreesMedium.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
