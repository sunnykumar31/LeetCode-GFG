class Solution {
    public int search(int[] nums, int target) {
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    // by binary search
    
    // first we have to find minimum value index thats mins starting index
        int i=0;
        int j=nums.length-1;
        while(i<j){
           int mid=(i+j)/2;
            if(nums[mid]>nums[j]) i=mid+1;
            else j=mid;
        }
        int start=i;
        i=0;
        j=nums.length-1;
        while(i<=j){
           int mid=(i+j)/2;
            int actualmid=(mid+start)%nums.length;
            if(nums[actualmid]==target) return actualmid;
            else if(nums[actualmid]<target) i=mid+1;
            else j=mid-1;
        }
        return -1;
    }
}