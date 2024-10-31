package Trees;

import java.util.ArrayList;
import java.util.List;

public class LeftView {
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    class Solution {
        int maxDept = 0;


        void preOrder(Node root, int currDept, List<Integer> list){
            if (root != null) {
                if (currDept > maxDept) {
                    list.add(root.data);
                    maxDept = currDept;
                }

                preOrder(root.left, currDept + 1, list);
                preOrder(root.right, currDept + 1, list);
            }
        }

        ArrayList<Integer> leftView(Node root) {
            maxDept = 0;
            ArrayList<Integer> leftView = new ArrayList<>();
            preOrder(root, 1, leftView);
            return leftView;
        }
    }

}
