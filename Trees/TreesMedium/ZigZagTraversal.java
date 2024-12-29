package Trees.TreesMedium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
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
                    row.add(0, node.val); // Add to the front of the list for reverse order.
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
