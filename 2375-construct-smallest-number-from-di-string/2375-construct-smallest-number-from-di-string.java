class Solution {
    public String smallestNumber(String pattern) {
        return FormNumber(pattern);
    }
    public static String FormNumber(String s){
        int len=s.length();
        int ans[]=new int[len+1];
        int count=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=len;i++){
            if(i==len || s.charAt(i)=='I'){
                ans[i]=count++;
                // count++;
                while(!st.isEmpty()){
                    ans[st.pop()]=count++;
                    // count++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str="";
        for(int i=0;i<len+1;i++){
            str+=ans[i];
        }
        return str;
        
    }
}