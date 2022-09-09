class Solution {
    public int specialArray(int[] nums) {
        int count=0;
        for(int i=0;i<1001;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    count++;
                }
                if(count>i){
                    break;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;
    }
}