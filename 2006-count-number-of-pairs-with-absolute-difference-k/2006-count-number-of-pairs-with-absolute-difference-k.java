class Solution {
    public int countKDifference(int[] nums, int k) {
        //brute forces
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(Math.abs(nums[i]-nums[j])==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        //one loop approch with extra constant space
        
        int ar[]=new int[101];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        int count=0;
        for(int i=0;i+k<101;i++){
            count+=ar[i]*ar[i+k];
        }
        return count;
    }
}