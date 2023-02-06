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
    public static ListNode reverse(ListNode slow,ListNode fast){
        ListNode cur=slow;
        ListNode prev=null;
        while(cur!=fast){
            ListNode nxtEle=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxtEle;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || right==left){
            return head;
        }
        ListNode nn=new ListNode(head.val);
        ListNode slow=head;
        ListNode fast=head;
        int count=1;
        while(count<left-1){
            slow=slow.next;
            fast=fast.next;
            count++;
        }
        ListNode slownext=slow.next;
        while(count<right+1){
            fast=fast.next;
            count++;
        }
        ListNode start=reverse(slow.next,fast);
        if(left==1){
            head=start;
            slownext.next=nn;
            nn.next=fast;
        }
        else{
            slow.next=start;
            slownext.next=fast;
        }
        
        return head;
    }
}