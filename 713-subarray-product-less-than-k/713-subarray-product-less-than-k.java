class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0){
            return 0;
        }
        int i=0;
        int j=0;
        long product=1;
        int ans=0;
        int n=nums.length;
        while(j<n){
            product*=nums[j];
                while(i<=j && product>=k){
                    product/=nums[i];
                    i++;
                }
                ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}