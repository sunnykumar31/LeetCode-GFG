class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];
        }
        int count=0;
        double val=(double)currsum/k;
        if(val>=threshold){
            count++;
        }
        int usesum=currsum;
        int post=k;
        int pre=0;
        int len=nums.length;
        while(post<len){
            usesum-=nums[pre];
            usesum+=nums[post];
            pre++;
            post++;
            val=(double)usesum/k;
            if(val>=threshold){
                count++;
            }
        }
        return count;
    }
}