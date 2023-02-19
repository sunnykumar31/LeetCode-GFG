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
    public static int countNode(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public int[] nextLargerNodes(ListNode head) {
        int ar[]=new int[countNode(head)];
        ListNode temp=head;
        for(int i=0;i<ar.length;i++){
            ar[i]=temp.val;
            temp=temp.next;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty() && ar[i]>ar[st.peek()]){
                ar[st.pop()]=ar[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ar[st.pop()]=0;
        }
        return ar;
    }
}