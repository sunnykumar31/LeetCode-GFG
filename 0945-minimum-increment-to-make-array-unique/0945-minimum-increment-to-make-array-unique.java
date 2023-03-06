class Solution {
    public int minIncrementForUnique(int[] nums) {
        int f[]=new int[105000];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        int i=0;
        int ans=0;
        while(i<f.length){
            if(f[i]>1){
                f[i]=f[i]-1;
                for(int j=i+1;j<f.length;j++){
                    if(f[j]==0){
                        f[j]=1;
                        ans=ans+j-i;
                        break;
                    }
                }
            }
            if(f[i]<2){
                i++;
            }
        }
        return ans;
    }
}