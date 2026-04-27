import java.util.*;
public class Ques6_leetcode143 {
        public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split & reverse second half
        ListNode secondHalf = slow.next;
        slow.next = null;
        secondHalf = reverseList(secondHalf);

        // Step 3: Merge two halves
        ListNode firstHalf = head;
        while(secondHalf != null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
   
   