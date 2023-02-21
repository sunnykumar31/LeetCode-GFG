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
        
        // int i=0;
        // int j=nums.length-1;
        // int mid=0;
        // while(i<j){
        //     mid=i+(j-i)/2;
        //     if(nums[mid]==nums[mid+1]){
        //         mid=mid-1;
        //     }
        //     if((mid-i+1)%2==0){
        //         i=mid+1;
        //     }
        //     else{
        //         j=mid;
        //     }
        // }
        // return nums[i];
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}