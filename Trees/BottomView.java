package Trees;

import java.util.*;

public class BottomView {
    public class Node{
        int data;
        int hd;
        Node left, right;
        public Node(int key){
            data = key;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }
    static Map<Integer, Integer> horizontalToVertical = new HashMap<>();
    static Map<Integer, Integer> horizontalToValue = new HashMap<>();
    static Integer horizontalDistance = 0;
    static Integer verticalDistance = 0;

    public void traversal(Node root){
        horizontalDistance--;

        traversal(root.left);
        if(root.left == null){
            horizontalToVertical.put(horizontalDistance, verticalDistance);
            horizontalToValue.put(horizontalDistance, root.data);
        }

    }
    public ArrayList<Integer> bottomView(Node root)
    {
        // Code here






    }
}
