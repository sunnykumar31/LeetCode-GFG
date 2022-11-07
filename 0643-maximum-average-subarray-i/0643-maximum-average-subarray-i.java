class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 1st approch 
        // int i=0;
        // int j=nums.length;
        // int st=0;
        // int max=Integer.MIN_VALUE;
        // int sum=0;
        // int divisor=k;
        // while(i<j){
        //     if(k>0){
        //         sum+=nums[i];
        //         k--;
        //         i++;
        //     }
        //     else{
        //         if(sum>max){
        //             max=sum;
        //         }
        //         sum-=nums[st];
        //         k++;
        //         st++;
        //     }
        // }
        // if(sum>max){
        //     max=sum;
        // }
        // double val=(double)max/divisor;
        // return val;
        
        //2nd approch
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];
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
            if(usesum>currsum){
                currsum=usesum;
            }
        }
        return (double)currsum/k;
    }
}