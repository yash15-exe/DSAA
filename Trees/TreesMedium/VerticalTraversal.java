package Trees.TreesMedium;
import java.util.*;
public class VerticalTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<int[]>> columnMap = new TreeMap<>();
        Queue<int[]> queue = new LinkedList<>();
        Queue<Object[]> bfsQueue = new LinkedList<>();
        bfsQueue.add(new Object[]{root, 0, 0});

        while (!bfsQueue.isEmpty()) {
            Object[] entry = bfsQueue.poll();
            TreeNode node = (TreeNode) entry[0];
            int col = (int) entry[1];
            int row = (int) entry[2];

            columnMap.putIfAbsent(col, new ArrayList<>());
            columnMap.get(col).add(new int[]{row, node.val});

            if (node.left != null) {
                bfsQueue.add(new Object[]{node.left, col - 1, row + 1});
            }
            if (node.right != null) {
                bfsQueue.add(new Object[]{node.right, col + 1, row + 1});
            }
        }


        List<List<Integer>> result = new ArrayList<>();


        for (Map.Entry<Integer, List<int[]>> entry : columnMap.entrySet()) {
            List<int[]> nodes = entry.getValue();

            nodes.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

            List<Integer> sortedColumn = new ArrayList<>();
            for (int[] node : nodes) {
                sortedColumn.add(node[1]);
            }
            result.add(sortedColumn);
        }

        return result;
    }
}
