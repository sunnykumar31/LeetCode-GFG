class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sumar[]=new int[nums.length];
        sumar[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sumar[i]=sumar[i-1]+nums[i];
        }
        int newar[]=new int[nums.length];
        newar[0]=sumar[nums.length-1]-nums[0]*(nums.length);
        for(int i=1;i<nums.length;i++){
            int presum=sumar[i-1];
            int postsum=sumar[nums.length-1]-presum-nums[i];
            int totsum=(nums[i]*i-presum)+postsum-nums[i]*(nums.length-i-1);
            newar[i]=totsum;
        }
        return newar;
    }
}