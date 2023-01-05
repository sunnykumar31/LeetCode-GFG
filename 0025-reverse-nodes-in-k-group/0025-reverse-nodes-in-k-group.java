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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode Add=new ListNode();
        ListNode temp=Add;
        Stack<ListNode> st=new Stack<>();
        ListNode start=null;
        while(head!=null){
            if(st.size()==0){
                start=head;
            }
            st.push(head);
            if(st.size()==k){
                while(!st.isEmpty()){
                    ListNode nn=new ListNode(st.pop().val);
                    Add.next=nn;
                    Add=Add.next;
                }
            }
            head=head.next;
        }
        if(st.size()!=0){
            Add.next=start;
        }
        return temp.next;
    }
}