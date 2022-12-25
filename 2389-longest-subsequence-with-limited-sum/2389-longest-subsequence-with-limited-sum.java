class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ln=nums.length;
        int lq=queries.length;
        int ans[]=new int[lq];
        Arrays.sort(nums);
        int comSum[]=new int[ln];
        comSum[0]=nums[0];
        for(int i=1;i<ln;i++){
            comSum[i]=comSum[i-1]+nums[i];
        }
        for(int i=0;i<lq;i++){
            for(int j=0;j<ln;j++){
                if(queries[i]<comSum[j]){
                    ans[i]=j;
                    break;
                }
            }
            if(queries[i]>=comSum[ln-1]){
                ans[i]=ln;
            }
        }
        return ans;
    }
}