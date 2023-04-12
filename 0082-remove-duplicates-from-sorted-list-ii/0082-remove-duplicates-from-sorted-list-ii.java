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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode fast=head;
        while(fast!=null){
            while(fast.next!=null && fast.val==fast.next.val){
                fast=fast.next;
            }
            if(prev.next==fast){
               prev=prev.next;
            }
            else{
                prev.next=fast.next;
            }
            fast=fast.next;
        }
        return dummy.next;
    }
}