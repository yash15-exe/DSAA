package Trees.TreesMedium;

public class MaxDiameter {
    public int diameterOfBinaryTree(TreeNode root) {
        int maxDiameter[] = new int[1];

        findHeight(root, maxDiameter);
        return maxDiameter[0];
    }

    public int findHeight(TreeNode root, int[] maxDiameter){
        if(root == null) return 0;
        int leftHeight = findHeight(root.left, maxDiameter);
        int rightHeight = findHeight(root.right, maxDiameter);

        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
