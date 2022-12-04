class Solution {
    public int minimumAverageDifference(int[] nums) {
        int l=nums.length;
        long sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }
        long pre_sum=0;
        long post_sum=sum;
        long min=Integer.MAX_VALUE;
        int index=-1;
        long avg=0;
        for(int i=0;i<l;i++){
            pre_sum+=nums[i];
            post_sum-=nums[i];
            if(l-1==i){
                avg=Math.abs((pre_sum)/(i+1));
            }
            else{
                avg=Math.abs(((pre_sum)/(i+1))-((post_sum)/(l-i-1)));
            }
            if(avg<min){
                min=avg;
                index=i;
            }
        }
        return index;
    }
}