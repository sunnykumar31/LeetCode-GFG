class Solution {
    // public static int minvalue(int[] nums){
    //     int min=101;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]!=0 && nums[i]<min){
    //             min=nums[i];
    //         }
    //     }
    //     return min;
    // }
    public int minimumOperations(int[] nums) {
        // int count=0;
        // while(true){
        //    int min=minvalue(nums);
        //    if(min==101){
        //         return count;
        //     } 
        //     count++;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]!=0){
        //             nums[i]=nums[i]-min;
        //         }
        //     }
        // }
        // return count;
        
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        hs.remove(0);
        return hs.size();
    }
}