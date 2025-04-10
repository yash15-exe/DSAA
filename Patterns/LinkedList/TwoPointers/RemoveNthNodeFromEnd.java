package Patterns.LinkedList.TwoPointers;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        if(head == null) return null;
        while(n>0){
            fast = fast.next;
            n--;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        if(slow.next != null){
            slow.next = slow.next.next;
        }
        else{
            return null;
        }

        return head;
    }
}
