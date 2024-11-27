package LinkedList.Easy_Medium;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k != 0 && fast.next!=null){
            fast = fast.next;
            k--;
            if(fast.next == null &&k!=0){
                fast = head;
                k--;
            }

        }

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;



        return head;
    }

}
