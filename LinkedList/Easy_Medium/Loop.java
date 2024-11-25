package LinkedList.Easy_Medium;
import java.util.*;
public class Loop {
    public boolean hasCycle(ReverseLinkedList.ListNode head) {
        ListNode slowTempNode = head;
        ListNode fastTempNode = head;
        while (slowTempNode != null) {
            if (fastTempNode.next == null || slowTempNode.next == null || fastTempNode.next.next == null) {
                return false;
            }

            fastTempNode = fastTempNode.next.next;

            slowTempNode = slowTempNode.next;
            if (slowTempNode == fastTempNode) {
                return true;
            }

        }
        return false;
    }
}
