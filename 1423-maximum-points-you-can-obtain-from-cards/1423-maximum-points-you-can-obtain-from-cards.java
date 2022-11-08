class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //long but easy code based on finding minimum subarray sum of length len-k then subtract from total sum;
        // int len=cardPoints.length;
        // int sum_total=0;
        // int j=cardPoints.length-1;
        // for(int i=0;i<len;i++){
        //     sum_total+=cardPoints[i];
        // }
        // int w_s=len-k; //window size
        // int min_sum=0;
        // for(int i=0;i<len-k;i++){
        //     min_sum+=cardPoints[i];
        // }
        // int cursum=min_sum;
        // int post=w_s;
        // int pre=0;
        // while(post<len){
        //     cursum-=cardPoints[pre];
        //     cursum+=cardPoints[post];
        //     pre++;
        //     post++;
        //     min_sum=Math.min(min_sum,cursum);
        // }
        // return sum_total-min_sum;
        
        //
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int i=0;i<k;i++){
            sum-=cardPoints[k-i-1];
            sum+=cardPoints[cardPoints.length-i-1];
            max=Math.max(sum,max);
        }
        return max;
    }
    
}