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
    int count(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1){
            head=null;
            return head;
        }
        else{
            int c=1;
            int p=count(head)-n;
            ListNode temp=head;
            if(p==0){
                head=temp.next;
                return head;
            }
            while(temp!=null){
                if(c==p){
                    temp.next=temp.next.next;
                    return head;
                }
                temp=temp.next;
                c++;
            }
        }
        return head;
    }
}