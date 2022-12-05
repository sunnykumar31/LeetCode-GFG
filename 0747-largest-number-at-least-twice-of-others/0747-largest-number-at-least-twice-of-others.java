class Solution {
    public int dominantIndex(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[index]<nums[i]){
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if((nums[i]!=nums[index])&&(2*nums[i]>nums[index])){
                return -1;
            }
        }
        return index;
    }
}