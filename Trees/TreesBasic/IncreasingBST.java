package Trees.TreesBasic;

import com.sun.source.tree.Tree;

public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = new TreeNode();
        inorderTraversal(root, node);
        return node;
    }

    public void inorderTraversal(TreeNode root, TreeNode node){
        if(root == null)return;
        inorderTraversal(root.left, node);
        node.left = root;
        inorderTraversal(root.right, node);

    }
}
