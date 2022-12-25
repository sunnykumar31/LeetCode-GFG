class Solution {
    public int[] dailyTemperatures(int[] t) {
        //by simple nested loop it give TLE in one test case
//         for(int i=0;i<t.length;i++){
//             int count=0;
//             int f=0;
//             for(int j=i+1;j<t.length;j++){
//                 if(t[i]<t[j]){
//                     f=1;
//                     count++;
//                     break;
//                 }
//                 else{
//                     count++;
//                 }
//             }
//             if(f==1)
//                 t[i]=count;
//             else{
//                 t[i]=0;
//             }
//         }
        
//         return t;  
        
        
        //next approch will be by stack
        
        int l=t.length;
        int ans[]=new int[l];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<l;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int j=st.pop();
                ans[j]=i-j;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
        
        
    }
}