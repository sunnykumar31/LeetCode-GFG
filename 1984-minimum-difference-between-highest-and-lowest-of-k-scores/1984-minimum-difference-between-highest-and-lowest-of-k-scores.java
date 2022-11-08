class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=k;i<nums.length+1;i++){
            int diff=nums[i-1]-nums[i-k];
            if(min>diff){
                min=diff;
            }
        }
        return min;
    }
}