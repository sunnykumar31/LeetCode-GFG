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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp1=head; // for finding middle node
        ListNode temp2=head; //for helping to finding middle node it store alternate address 
        ListNode temp3=head;// for finding just previous node of middle node
        if(temp1.next==null){ //if only one node then it is middle node
            return null;
        }
        else{
            while(temp2!=null && temp2.next!=null){ // finding middle node
                temp3=temp1; //middle prev
                temp1=temp1.next; //middle 
                temp2=temp2.next.next;
            }
            
        }
        temp3.next=temp1.next;
        // while(temp3.next!=temp1){ //finding previous node of middle node ,previous node have address of middle node  and middle node have address of past node of middle so we have to replace past node address to previous node address than middle element will deleted.
        //     temp3=temp3.next;
        // }
        // temp3.next=temp1.next;
        return head;
        
    }
}