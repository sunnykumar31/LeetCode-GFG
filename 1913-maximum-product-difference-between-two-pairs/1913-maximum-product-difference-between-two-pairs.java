class Solution {
    public int maxProductDifference(int[] nums) {
        //by sorting;
        // Arrays.sort(nums);
        // int n=nums.length;
        // int diff=(nums[n-1]*nums[n-2] )-(nums[0]*nums[1]);
        // return diff;
        
        //by 1st max 2nd max and 1st min ,2nd min
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max1){
                max2=max1;
                max1=nums[i];
            }
            else if(max1>=nums[i] && max2<nums[i] && nums[i]<=max1){
                max2=nums[i];
            }
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }
            else if(min1<=nums[i] && min2>nums[i] && nums[i]>=min1){
                min2=nums[i];
            }
        }
        return max1*max2-min1*min2;
    }
}