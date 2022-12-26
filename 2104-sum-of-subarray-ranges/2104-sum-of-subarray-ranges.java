class Solution {
    public long subArrayRanges(int[] nums) {
        //Without stack and n^2
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[i],min=nums[i];
            for(int j=i;j<nums.length;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                sum+=max-min;
                
            }
        }
        return sum;
        
    }
}