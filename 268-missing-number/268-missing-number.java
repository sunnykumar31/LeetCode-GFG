class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totsum=(n*(n+1))/2;
        int arsum=0;
        for(int i=0;i<n;i++){
            arsum+=nums[i];
        }
        return totsum-arsum;
    }
}