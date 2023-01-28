/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            tempB=headB;
            while(tempB!=null){
                if(tempA==tempB){
                    return tempA;
                }
                tempB=tempB.next;
            }
            tempA=tempA.next;
        }
        return tempA;
    }
}