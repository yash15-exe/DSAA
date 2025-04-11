package Patterns.LinkedList.TwoPointers;

public class MergeNodesBeforeZero {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        ListNode curr = head.next;
        int sum = 0;

        while (curr != null) {
            if (curr.val == 0) {
                result.next = new ListNode(sum);
                result = result.next;
                sum = 0;
            } else {
                sum += curr.val;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
