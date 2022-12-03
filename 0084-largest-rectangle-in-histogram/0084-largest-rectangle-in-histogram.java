class Solution {
    public int largestRectangleArea(int[] heights) {
        return Area(heights);
    }
    public static int Area(int ar[]){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty() && ar[i]<ar[st.peek()]){
                int r=i;
                int h=ar[st.pop()];
                if(!st.isEmpty()){
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
                else{
                    ans=Math.max(ans,h*(r));
                }
            }
            st.push(i);
        }
        int r=ar.length;
        while(!st.isEmpty()){
                int h=ar[st.pop()];
                if(!st.isEmpty()){
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
                else{
                    ans=Math.max(ans,h*(r));
                }
            }
        return ans;
        
    }
}