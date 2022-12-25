class Solution {
    public int[] nextGreaterElements(int[] ar) {
        int ans[]=new int[ar.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty() && ar[i]>ar[st.peek()]){
                ans[st.pop()]=ar[i];
            }
            st.push(i);
        }
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty() && ar[i]>ar[st.peek()]){
                ans[st.pop()]=ar[i];
            }
            // st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}