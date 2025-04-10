package Patterns.LinkedList.TwoPointers;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == headB)return headA;
        ListNode a = headA, b = headB;
        while(a!=b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
            if(a==b)return a;
        }
        return null;

    }
}
