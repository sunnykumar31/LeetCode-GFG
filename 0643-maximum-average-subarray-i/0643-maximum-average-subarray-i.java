class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=nums.length;
        int st=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int divisor=k;
        while(i<j){
            if(k>0){
                sum+=nums[i];
                k--;
                i++;
            }
            else{
                if(sum>max){
                    max=sum;
                }
                sum-=nums[st];
                k++;
                st++;
            }
        }
        if(sum>max){
            max=sum;
        }
        double val=(double)max/divisor;
        return val;
    }
}