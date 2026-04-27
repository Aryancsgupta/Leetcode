public class Question8_leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null && current.next.next != null){
            if(current.next.val == current.next.next.val){
                int duplicateVal = current.next.val;
                while(current.next != null && current.next.val == duplicateVal){
                    current.next = current.next.next; 
                }
            } else {
                current = current.next; 
            }
        }
        return dummy.next; 
    }
}
