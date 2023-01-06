class Solution {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(min>nums[i]){
        //         min=nums[i];
        //     }
        // }
        // return min;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]>nums[j]) i=mid+1;
            else j=mid;
        }
        return nums[i];
    }
}