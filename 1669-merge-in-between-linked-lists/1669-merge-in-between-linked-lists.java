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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode NodeOfA=null;
        ListNode NodeOfB=null;
        int count=0;
        while(count!=b){
            if(count==a-1){
                NodeOfA=temp;
            }
            count++;
            temp=temp.next;
        }
        NodeOfB=temp.next;
        ListNode temp2=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        NodeOfA.next=list2;
        temp2.next=NodeOfB;
        return list1;
    }
}