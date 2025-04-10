package Patterns.LinkedList.TwoPointers;




public class SwapAdjacent {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ans = head.next;
        ListNode first = head;
        ListNode second = head.next;
        ListNode prev = null;

        while (first != null && second != null) {
            ListNode node = second.next;
            second.next = first;
            first.next = (node != null && node.next != null) ? node.next : node;
            if (prev != null) prev.next = second;
            prev = first;
            first = node;
            second = (first != null) ? first.next : null;
        }

        return ans;
    }
}
