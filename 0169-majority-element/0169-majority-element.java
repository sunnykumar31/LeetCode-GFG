class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=1;
        int element=0;
        int i=0;
        for(;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            else{
               if(c>n/2){
                    element=nums[i];

                } 
                c=1;
            } 
        }
        if(c>n/2){
            element=nums[i];

        } 
        return element;
    }
}