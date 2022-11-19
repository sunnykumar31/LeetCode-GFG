class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        // median approch
        // int len=nums.length;
        // if(len==1){
        //     return 0;
        // }
        // if(len%2==0){
        //     int index=len/2;
        //     int median1=(nums[index]+nums[index-1])/2;
        //     int median2=median1+1;
        //     int count1=0;
        //     int count2=0;
        //     for(int i=0;i<len;i++){
        //         count1+=Math.abs(median1-nums[i]);
        //         count2+=Math.abs(median2-nums[i]);
        //     }
        //     return Math.min(count1,count2);
        // }
        // else{
        //     int index=len/2;
        //     int median1=nums[index];
        //     int count1=0;
        //     for(int i=0;i<len;i++){
        //         count1+=Math.abs(median1-nums[i]);
        //     }
        //     return count1;
        // }
        
        int i =0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j){
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }
}