package LinkedList.Easy_Medium;

public class MergeTwoSortedList {
    public class ListNode {
        int val;
        RemoveNthNode.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, RemoveNthNode.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null || list2 == null){
            if(list1 == null){
                return list2;
            }else{
                return list1;
            }
        }
        ListNode answer = new ListNode();
        if(list1.val>list2.val){
            answer = new ListNode(list2.val);
            list2 = list2.next;
        }
        else{
            answer = new ListNode(list1.val);
            list1 = list1.next;
        }
        ListNode temp = answer;

        while(list1 != null || list2 != null){
            if(list1 == null){
                while(list2 != null){
                    answer.next = new ListNode(list2.val);
                    list2 = list2.next;
                    answer = answer.next;
                }
                return temp;
            }
            if(list2 == null){
                while(list1 != null){
                    answer.next = new ListNode(list1.val);
                    list1 = list1.next;
                    answer = answer.next;
                }
                return temp;
            }
            if(list1.val>=list2.val){
                answer.next = new ListNode(list2.val);
                list2 = list2.next;
                answer = answer.next;
            }
            else if(list2.val>=list1.val){
                answer.next = new ListNode(list1.val);
                list1 = list1.next;
                answer = answer.next;
            }
        }
        return temp;
    }
}
