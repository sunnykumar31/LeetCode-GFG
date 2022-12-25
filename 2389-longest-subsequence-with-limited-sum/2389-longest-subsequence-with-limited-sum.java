class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ln=nums.length;
        int lq=queries.length;
        int ans[]=new int[lq];
        Arrays.sort(nums);
        for(int i=1;i<ln;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<lq;i++){
            if(queries[i]>=nums[ln-1]){
                ans[i]=ln;
                continue;
            }
            for(int j=0;j<ln;j++){
                if(queries[i]<nums[j]){
                    ans[i]=j;
                    break;
                }
            }
            
        }
        return ans;
    }
}