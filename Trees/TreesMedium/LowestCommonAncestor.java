package Trees.TreesMedium;

public class LowestCommonAncestor {
    public static Object findAncestor(TreeNode node, int first, int second){
        if(node==null)return null;
        if(node.val==first||node.val==second)return node.val;
        Object left = findAncestor(node.left, first, second);
        Object right = findAncestor(node.right, first, second);
        if(left!=null&&right!=null)return node.val;

        if(left!=null)return left;
        return right;
    }
}
