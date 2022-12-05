class Solution {
    public int dominantIndex(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[index]<nums[i]){
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if((nums[i]!=nums[index])&&(2*nums[i]>nums[index])){//if  2nd largest element is greater than max then return -1; 1st statement not be equall to max if this statement not check then it will always return -1 . 2nd statement if it true than it doesnot qualify the requirement of question,max value always greater or equal to any of element in array.
                return -1;
            }
        }
        return index;
    }
}