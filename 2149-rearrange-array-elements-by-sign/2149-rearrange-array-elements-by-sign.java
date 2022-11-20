class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int ar[]=new int[l];
        int j=0;
        int k=1;                                    
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                ar[j]=nums[i];
                j+=2;
            }
            else{
                ar[k]=nums[i];
                k+=2;
            }
        }
        return ar;
    }
}