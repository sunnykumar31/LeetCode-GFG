class Solution {
    public int minIncrementForUnique(int[] nums) {
        int f[]=new int[105000];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        int i=0;
        int ans=0;
        while(i<f.length-1){
            if(f[i]>1){
                ans+=f[i]-1;
                f[i+1]=f[i+1]+f[i]-1;
            }
            i++;
        }
        return ans;
    }
}