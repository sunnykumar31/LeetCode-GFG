class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        st.push(pushed[0]);
        while(j<popped.length){
            if(st.isEmpty()){
                st.push(pushed[i]);
                i++;
            }
            else if(i<pushed.length && st.peek()!=popped[j]){
                st.push(pushed[i]);
                i++;
            }
            else if(i==pushed.length && st.peek()!=popped[j]){
                return false;
            }
            else{
                st.pop();
                j++;
            }
        }
        return true;
    }
}