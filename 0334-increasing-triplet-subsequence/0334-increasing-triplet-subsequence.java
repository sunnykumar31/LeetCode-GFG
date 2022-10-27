class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len=nums.length;
        if(len<3){
            return false;
        }
        int minVal1=Integer.MAX_VALUE;
        int minVal2=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i]<minVal1){
                minVal1=nums[i];
            }
            else if(nums[i]<minVal2 && nums[i]>minVal1){
                minVal2=nums[i];
            }
            else if(nums[i]>minVal1 && nums[i]>minVal2){
                return true;
            }
        }
        return false;
    }
}