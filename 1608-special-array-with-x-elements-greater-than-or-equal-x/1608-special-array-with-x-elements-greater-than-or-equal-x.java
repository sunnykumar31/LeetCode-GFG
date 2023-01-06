class Solution {
    public int specialArray(int[] nums) {
        // //brute force
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
        
        
        //by sorting approch;
        // int count=nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0) count--;
        //     else count=Math.min(count,nums[i]);
        // }
        // if(count==0) return -1;
        // return count;
    }
}