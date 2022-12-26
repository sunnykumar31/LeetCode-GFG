class Solution {
    public boolean canJump(int[] nums) {
        // 2 loop  not appropriate approch
//         int l=nums.length;
//         if(l==1){
//             return true;
//         }
//         if(nums[0]==0){
//             return false;
//         }
//         for(int i=0;i<l-1;i++){
//             int j=nums[i];
//             while(j<l){
//                 if(j==l-1){
//                     return true;
//                 }
//                 if(nums[j]==0){
//                     break;
//                 }
//                 j+=nums[j];
//             }
//             if(j>=l-1){
//                 return true;
//             }
//         }
//         return false;
        
        //  int boundary = 0;
        //  for(int i =0;i<=boundary;i++){
        //      boundary = Math.max(boundary,i+nums[i]);
        //      if(boundary >=nums.length-1)
        //      return true;
        //  } 
        // return false;
        
        int reach=0;
        for(int i=0;i<nums.length;i++){
            if(reach<i){
                return false;
            }
            reach=Math.max(reach,i+nums[i]);
            // if(reach>=nums.length-1) return true;
        }
        return true;
    }
}