class Solution {
    public int maxSubArray(int[] nums) {
        // order(n^2) thats why wrong ans
        int l=nums.length;
        // int ans=nums[0];
        // for(int i=0;i<l;i++){
        //     int sum=0;
        //     for(int j=i;j<l;j++){
        //         sum+=nums[j];
        //         ans=Math.max(ans,sum);
        //     }
        // }
        // return ans;
        
        int sum=0;
        int ans=nums[0];
        for(int i=0;i<l;i++){
            sum=sum+nums[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}