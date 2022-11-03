class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        //consecutive sum array;
        int sumar[]=new int[nums.length];
        sumar[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sumar[i]=sumar[i-1]+nums[i];
        }
        
        // new array where store the ans // 
        int newar[]=new int[nums.length];
        
        //finding pre sum of before of that element and post sum after of that element (total sum- presum - present element) and multiply by count int pre sum and post sum ex ar[2,3,5] pre sum for element 3 is 2 and post sum 10-2-3=5 ,totsum=3*1(index=1)-2(presum)+5(postsum)-3*(3-1-1)
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