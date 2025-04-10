package Patterns.LinkedList.TwoPointers;

public class SortList {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;


        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);


        return merge(left, right);
    }
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) prev.next = null;

        return slow;
    }


    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }


        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

}
