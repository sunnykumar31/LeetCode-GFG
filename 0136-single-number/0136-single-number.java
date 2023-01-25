class Solution {
    public int singleNumber(int[] nums) {
//         Arrays.sort(nums);
//         int len=nums.length;
//         int count=0;
//         int index=0;
//         for(int i=1;i<len;i++){
//             int ele=nums[index];
//             if(ele==nums[i]){
//             }
//             else{
//                 count=i-index;
//                 index=i;
//                 if(count==1){
//                     return ele;
//                 }
//             }
//         }
//         return nums[len-1];
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}