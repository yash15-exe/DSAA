package Patterns.LinkedList.TwoPointers;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverse(head);

    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next==null)return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
