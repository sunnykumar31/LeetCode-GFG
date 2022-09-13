class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ar[]=new int[2*n];
        for(int i=0;i<n;i++){
            ar[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<2*n;i++){
            ar[i]=nums[j];
            j++;
        }
        return ar;
    }
}