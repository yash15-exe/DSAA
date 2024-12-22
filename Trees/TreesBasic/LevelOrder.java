package Trees.TreesBasic;

import java.util.*;

public class LevelOrder {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> smallAns = new ArrayList<>();
            for (int i = 0; i < size; i++) {

            TreeNode newElement = queue.poll();
                assert newElement != null;
                if (newElement.right!=null)queue.add(newElement.right);
            if(newElement.left!=null)queue.add(newElement.left);
            smallAns.add(newElement.val);
            }
            ans.add(smallAns);
        }
        return ans;
    }
}
