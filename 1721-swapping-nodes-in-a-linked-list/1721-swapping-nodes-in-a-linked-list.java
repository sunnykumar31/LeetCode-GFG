/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode traversal=head;
        ListNode fast=head;
        while(k-->1){
            slow=slow.next;
            traversal=traversal.next;
        }
        while(traversal.next!=null){
            fast=fast.next;
            traversal=traversal.next;
        }
        int temp=slow.val;
        slow.val=fast.val;
        fast.val=temp;
        System.out.println(slow.val);
        System.out.println(fast.val);
        return head;
    }
}