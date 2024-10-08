



class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {

        ListNode current = new ListNode();
        ListNode newHead = new ListNode();
        ListNode temp = new ListNode();
        if(head == null){
            return null;
        }
        newHead = head;
        current = head;
        while(current.next!=null){
            temp = current.next.next;
            current.next.next = newHead;
            newHead = current.next;
            current.next = temp;

        }
        return newHead;
    }
}