package Patterns.LinkedList.TwoPointers;

public class Cycle {
    public ListNode detectCycle(ListNode head) {
        // Set<ListNode> set = new HashSet<>();
        // if(head == null)return null;
        // ListNode pointer = head;
        // while(pointer.next!=null){
        //     if(set.contains(pointer)){
        //         return pointer;
        //     }
        //     set.add(pointer);
        //     pointer = pointer.next;

        // }
        // return null;

        ListNode slow = head, fast = head;
        if(head == null) return null;
        while(fast !=null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                slow = head;
                while(fast !=null && fast.next != null){

                    if(slow == fast)return slow;
                    slow = slow.next;
                    fast = fast.next;
                }
            }
        }
        return null;
    }
}
