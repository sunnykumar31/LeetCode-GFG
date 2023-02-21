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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode last=temp.next.next;
        head=head.next;
        head.next=temp;
        head.next.next=last;
        ListNode prev=temp;
        temp=last;
        if(temp==null){
                return head;
            }
        System.out.println(prev.val);
        while(temp.next!=null){
            // System.out.println(temp.val);
            ListNode cur=temp;
            ListNode dub=temp;
            last=dub.next.next;
            prev.next=cur.next;
            prev.next.next=cur;
            // cut.next=cur.next;
            cur.next=last;
            // temp=last;
            prev=dub;
            temp=last;
            if(temp==null){
                return head;
            }
            // System.out.println(prev.val);
        }
        // System.out.println(head.val);
        return head;
        
    }
}