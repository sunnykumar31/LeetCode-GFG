class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                int diff=nums[i]-nums[i+1];
                nums[i+1]=nums[i]+1;
                count=count+diff+1;
            }
        }
        return count;
    }
}