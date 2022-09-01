class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[]=new int[2];
//         int i=0;
//         int j=nums.length-1;
//         while(i<j){
//             if(nums[i]>=target){
//                 i++;
//             }
//             else if(nums[j]>=target){
//                 j--;
//             }
//             else{
//                 if(nums[i]+nums[j]==target){
//                     ar[0]=i;
//                     ar[1]=j;
//                     return ar;
//                 }
//                 else{
                    
//                 }
//             }
//         }
//         return ar;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]>target){
            // }
            // else{
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        ar[0]=i;
                        ar[1]=j;
                        return ar;
                    }
                // }
            }
            
        }
        return ar;
        
    }
}