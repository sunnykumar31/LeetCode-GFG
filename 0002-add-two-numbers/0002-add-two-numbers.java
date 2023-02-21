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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int f=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            if(sum>9) carry=1;
            else carry=0;
            l1.val=sum%10;
            l2.val=sum%10;
            l1=l1.next;
            l2=l2.next;
        }
        // ListNode prev1=l1;
        // ListNode prev2=l2;
        while(l1!=null){
            int sum=l1.val+carry;
            if(sum>9) carry=1;
            else carry=0;
            l1.val=sum%10;
            // prev1=l1;
            l1=l1.next;
            f=1;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            if(sum>9) carry=1;
            else carry=0;
            l2.val=sum%10;
            // prev2=l2;
            l2=l2.next;
        }
        if(f==1){
            if(carry==1){
                ListNode last=new ListNode(1);
                ListNode prev1=temp1;
                while(prev1.next!=null){
                    prev1=prev1.next;
                }
                prev1.next=last;
            }
            return temp1;
        }
        else{
            if(carry==1){
                ListNode last=new ListNode(1);
                ListNode prev2=temp2;
                while(prev2.next!=null){
                    prev2=prev2.next;
                }
                prev2.next=last;
            }
            return temp2;
        }
    }
}