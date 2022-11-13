class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int n=nums.length;
        for(int k=0;k<n;k++){
            if(nums[k]>max){
                max=nums[k];
                j=k;
            }
            if(nums[k]<min){
                min=nums[k];
                i=k;
            }
        }
        if(j>=i){
            // if(j>=n/2){
                int p=n-j+i+1;
                int q=n-i;
                // return Math.min(p,q);
            // }
            // else{
                // return j+1;
            // }
            return Math.min(Math.min(p,q),j+1);
        }
        else{ 
            // if(i>=n/2){
                int p=n-i+j+1;
                int q=n-j;
                // return Math.min(p,q);
            // }
            // else{
                // return i+1;
            // }
            return Math.min(Math.min(p,q),i+1);
        }
    }
}