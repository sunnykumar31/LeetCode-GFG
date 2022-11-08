class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=nums.length;
        int sum=0;
        int k=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        while(i<j){
            if(sum<target){
                sum+=nums[i];
                count++;
                i++;
            }
            else{
                if(count<min){
                    min=count;
                }
                sum=sum-nums[k];
                k++;
                count--;
            }
            
        }
        while(sum>=target){
            if(count<min){
                min=count;
            }
            sum=sum-nums[k];
            k++;
            count--;
        }
        if(min==2147483647) return 0;
        return min;
        
        
        
    
    }
}