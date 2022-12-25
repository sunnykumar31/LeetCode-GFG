class Solution {
    public int maxProfitAssignment(int[] diff, int[] profit, int[] worker) {
        int ld=diff.length;
        int lp=profit.length;
        int lw=worker.length;
        int ans[]=new int[lw];
        for(int i=0;i<lw;i++){
            for(int j=0;j<ld;j++){
                if(worker[i]>=diff[j]){
                    if(ans[i]<profit[j]){
                        ans[i]=profit[j];
                    }
                }
            }
        }
        int sum=0;
        for(int i=0;i<ans.length;i++){
            sum+=ans[i];
        }
        return sum;
    }
}