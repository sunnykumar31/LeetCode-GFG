class Solution {
    public int waysToSplitArray(int[] nums) {
        int l=nums.length;
        long sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }
        long pre_sum=0;
        long post_sum=sum;
        int count=0;
        for(int i=0;i<l-1;i++){
            pre_sum+=nums[i];
            post_sum-=nums[i];
            if(pre_sum>=post_sum){
                count++;
            }
        }
        return count;
    }
    
}