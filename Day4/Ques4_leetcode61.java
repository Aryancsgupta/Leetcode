import java.util.Arrays;
public class Ques4_leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp.next = head; 
        k = k % length; 
        for(int i = 0; i < length - k; i++){
            temp = temp.next; 
        }
        ListNode newHead = temp.next; 
        temp.next = null; 
        return newHead;
    }
}
