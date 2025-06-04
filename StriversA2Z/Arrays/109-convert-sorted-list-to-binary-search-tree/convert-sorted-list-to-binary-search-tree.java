class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return buildBST(list, 0, list.size() - 1);
    }

    private TreeNode buildBST(List<Integer> list, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = buildBST(list, left, mid - 1);
        root.right = buildBST(list, mid + 1, right);

        return root;
    }
}
