class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int j=0;
        while(j<nums.length){
            ans=ans^j^nums[j];
            j++;
        }
        return ans^j;
    }
}