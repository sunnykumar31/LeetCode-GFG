class Solution {
    public int numOfPairs(String[] nums, String target) {
        //O(n2)
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(target.equals(nums[i]+nums[j])){
                    count++;
                                          
                }
                if(target.equals(nums[j]+nums[i])){
                          count++;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(target.equals(nums[i]+nums[j]) && i!=j){
        //             count++;
        //             // if(nums[i].equals(nums[j])){
        //             //       count++;
        //             // }   
        //         }
        //     }
        // }
        return count;
    }
}