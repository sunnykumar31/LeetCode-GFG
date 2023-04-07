class Solution {
    public int lengthOfLIS(int[] nums) {
        // this is n^2 approch
       // int dp[]=new int[nums.length];
       //  Arrays.fill(dp,1);
       //  for(int i=1;i<nums.length;i++){
       //      // int max=0;
       //      for(int j=i-1;j>=0;j--){
       //          if(nums[i]>nums[j]){
       //              dp[i]=Math.max(dp[i],dp[j]+1);
       //          }
       //      }
       //      // dp[i]=max+dp[i];
       //  }
       //  int max=Integer.MIN_VALUE;
       //  for(int i=0;i<dp.length;i++){
       //      max=Math.max(max,dp[i]);
       //  }
       //  return max;
        
        //nlogn approch.
        
        int ar[]=new int[nums.length];
        int l=1;
        int count=1;
        ar[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>ar[l-1]){
                ar[l++]=nums[i];
                // System.out.println(ar[l-1]);
            }
            else{
                int idx=search(ar,0,l-1,nums[i]);
                ar[idx]=nums[i];
                // System.out.println(ar[idx]);
            }
        }
        return l;
    }
    public static int search(int ar[],int si,int li,int target){
        int ans=0;
        while(si<=li){
            int mid=(li+si)/2;
            if(ar[mid]>=target){
                ans=mid;
                li=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
    
}