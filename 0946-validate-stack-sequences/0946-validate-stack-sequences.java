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
        
        //Explantion agar stack empty to hai to phle usme insert krenge agr empty nhi hai to stack k top element se poped k top element se compare krenge agr dono equal hai to mtlb mujhe use pop krna hai agr aisa nhi hota hai to hame push ko aage badhate rhna hai ,ek point pushed array agr empty ho gya mtlb sara valued push hoa gya then agr top value of stack nhi match krta hai poped element se then ye validate nhi hai, false hai 
    }
}