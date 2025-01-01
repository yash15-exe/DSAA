package Trees.TreesMedium;

import java.util.List;

public class PathToNode {

    public static boolean findPath(TreeNode node, List<Integer> arr, int target){
        if(node == null)return false;
        arr.add(node.val);
        if(node.val==target)return true;
        if (findPath(node.left, arr, target) || findPath(node.right, arr, target)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }
}
