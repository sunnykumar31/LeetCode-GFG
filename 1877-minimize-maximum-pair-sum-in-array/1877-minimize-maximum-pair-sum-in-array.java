class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum1=0;
        int max=0;
        while(i<j){
            sum1=nums[i]+nums[j];
            if(sum1>max){
                max=sum1;
            }
            i++;
            j--;
        }
        return max;
    }
}