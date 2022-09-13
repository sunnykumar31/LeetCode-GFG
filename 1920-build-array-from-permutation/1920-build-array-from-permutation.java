class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=nums[nums[i]];
        }
        return ar;
    }
}