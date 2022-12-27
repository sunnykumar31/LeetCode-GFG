class Solution {
    public String removeDuplicates(String s) {
        //without stack
        // StringBuilder sb=new StringBuilder(s);
        // int len=sb.length();
        // for(int i=0;i<sb.length()-1;i++){
        //     char c1=sb.charAt(i);
        //     char c2=sb.charAt(i+1);
        //     if(c1==c2){
        //         sb.delete(i,i+2);
        //         if(i==0){
        //             i=i-1;
        //         }
        //         else{
        //             i=i-2;
        //         }
        //         // i=i==0?i-1:i-2;
        //     }
        // }
        // return sb.toString();
        
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==st.peek()){
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