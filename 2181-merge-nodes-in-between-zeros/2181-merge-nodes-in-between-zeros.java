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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode sumNode=head;
        while(temp!=null){
            if(temp.val==0){
                sumNode.next=temp;
                sumNode=temp;
                temp=temp.next;
            }
            else{
                sumNode.val=sumNode.val+temp.val;
                temp=temp.next;
            }
        }
        ListNode t=head;
        while(t.next.next!=null){
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}