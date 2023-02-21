class Solution {
    public int singleNonDuplicate(int[] nums) {
       // time oder(n)
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         i++;
        //     }
        //     else{
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];
        
        int start=0;
        int last=nums.length-1;
        int mid=start+(last-start)/2;
        while(start<last){
            mid=start+(last-start)/2;
            if(nums[mid]==nums[mid+1]){
                mid=mid-1;
            }
            if((mid+1-start)%2==0){
                start=mid+1;
            }
            else{
                last=mid;
            }
        }
        return nums[start];
        
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     ans=ans^nums[i];
        // }
        // return ans;
    }
}