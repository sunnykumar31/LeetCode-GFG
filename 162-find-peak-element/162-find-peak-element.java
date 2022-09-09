class Solution {
    public int findPeakElement(int[] nums) {
        //but this solution is of order(n)
        // int max=(int)-Math.pow(2,31);
        // int i=0;
        // int index=0;
        // while(i<nums.length){
        //     if(max<nums[i]){
        //         max=nums[i];
        //         index=i;
        //     }
        //     i++;
        // }
        // return index;
        
        //this solution in logn
        int s = 0;
        int e = nums.length-1;
        int mid = s+(e-s)/2;
        while(s<e){
            if(nums[mid]<nums[mid+1]){
                s = mid+1;
            }
            else{
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        return mid;
    }
}