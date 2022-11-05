class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int pre=0;
        for(int i=0;i<nums.length;i++){
            int post=sum-pre-nums[i];
            if(pre==post){
                return i;
            }
            pre+=nums[i];
        }
        return -1;
    }
}