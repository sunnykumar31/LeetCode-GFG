class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int ans[]=new int[l2];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<l2;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                ans[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=ans[j];
                    break;
                }
            }
        }
        return nums1;
    }
}