class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ar[]=new int[2*n];
        for(int i=0;i<n;i++){
            ar[i]=nums[i];
            ar[i+n]=nums[i];
        }
        return ar;
    }
}