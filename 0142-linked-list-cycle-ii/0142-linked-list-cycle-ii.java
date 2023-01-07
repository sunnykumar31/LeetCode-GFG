/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            count++;
            if(slow==fast){
                break;
            }
        
        }
       if (fast == null || fast.next == null) return null;
        // this loop for finding the node from where cycle form
        while (head != fast) {
            head = head.next;
            fast = fast.next;
            // fast ki jgah slow bhi le skte hai dono ek hi index ko denote kr rha hai
        }
        return head;

    }
}