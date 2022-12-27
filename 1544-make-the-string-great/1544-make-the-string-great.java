class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && (ch==st.peek()-32 || ch==st.peek()+32)){
                st.pop();
            }
            else{
                st.push(ch);
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}