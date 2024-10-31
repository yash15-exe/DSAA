package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTrees {



      public static class TreeNode {
          int val;
         TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
              this.left = left;
              this.right = right;
         }
      }


            void orderCustom(TreeNode root, List<Integer> list){
                if(root!=null){
                    orderCustom(root.left, list);
                    list.add(root.val);//change the position of the addition to create pre and post order traversals
                    orderCustom(root.right, list);
                }else{
                    return;
                }
            }
            public List<Integer> inorderTraversal(TreeNode root) {
                List<Integer> answer = new ArrayList<>();

                orderCustom(root, answer);
                return answer;

            }
}
