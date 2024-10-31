import java.util.ArrayList;
class Node{
int data;
        Node left, right;

Node(int item)
{
    data = item;
    left = right = null;
}
}
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        Node temp = root;
        ArrayList<Integer> list = new ArrayList<>();
        while(root != null){
            list.add(root.data);
            if(root.left == null){
                    root = root.right;
            }else{
                root = root.left;
            }
        }
        return list;
    }
}