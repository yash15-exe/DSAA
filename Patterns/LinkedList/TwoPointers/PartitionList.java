package Patterns.LinkedList.TwoPointers;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null)return null;
        ListNode greater = new ListNode();
        ListNode smaller = new ListNode();
        ListNode small = smaller;
        ListNode great = greater;
        while(head!=null){
            if(head.val < x){
                smaller.next = new ListNode(head.val);
                smaller = smaller.next;
            }
            else{
                greater.next = new ListNode(head.val);
                greater = greater.next;
            }
            head = head.next;
        }
        smaller.next = great.next;
        return small.next;
    }
}
