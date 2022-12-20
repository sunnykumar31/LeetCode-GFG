class Solution {
    public int repeatedNTimes(int[] nums) {
        // int ar[]=new int[10001];
        // for(int i=0;i<nums.length;i++){
        //     ar[nums[i]]++;
        // }
        // for(int j=0;j<10001;j++){
        //     if(ar[j]==nums.length/2){
        //         return j;
        //     }
        // }
        // return -1;
        
        int len=nums.length;
        for(int i=0;i<len-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]){
                return nums[i];
            }
        }
        return nums[len-1];
    }
}