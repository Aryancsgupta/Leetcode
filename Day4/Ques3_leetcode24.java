import java.util.List;
public class Ques3_leetcode24 {
    if (head == null || head.next == null) {
            return head;
        }

    
        ListNode first = head;
        ListNode second = head.next;

        second.next = first;                  

        return second;
}
