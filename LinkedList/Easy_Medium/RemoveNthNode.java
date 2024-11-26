package LinkedList.Easy_Medium;

public class RemoveNthNode {
    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode current = head;
        if(head.next == null && n==1){
            return null;
        }
        if(head==null){
            return null;
        }
        while(n!=0){
            temp = temp.next;
            n--;
        }
        while(temp!=null && temp.next!=null){
            temp = temp.next;
            current = current.next;
        }
        if(current==head &&temp==null){
            return head.next;
        }
        if(current.next!=null){
            current.next = current.next.next;
        }else{
            current.next = null;
        }

        return head;
    }
}
