class Solution {
    public int[] diStringMatch(String s) {
        int len=s.length();
        int ar[]=new int[len+1];
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='I'){
                ar[i]=count++;
            }
            else{
                st.push(i);
            }
        }
        ar[len]=count++;
        while(!st.isEmpty()){
            ar[st.pop()]=count++;
        }
        return ar;
    }
}