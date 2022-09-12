class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    count++;
                }
                else{
                    st.pop();
                }
            }
        }
        count+=st.size();
        return count;
    }
}