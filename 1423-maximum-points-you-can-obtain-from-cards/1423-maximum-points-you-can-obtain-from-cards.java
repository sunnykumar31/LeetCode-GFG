class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length;
        int sum_total=0;
        int j=cardPoints.length-1;
        for(int i=0;i<len;i++){
            sum_total+=cardPoints[i];
        }
        int w_s=len-k; //window size
        int min_sum=0;
        for(int i=0;i<len-k;i++){
            min_sum+=cardPoints[i];
        }
        int cursum=min_sum;
        int post=w_s;
        int pre=0;
        while(post<len){
            cursum-=cardPoints[pre];
            cursum+=cardPoints[post];
            pre++;
            post++;
            min_sum=Math.min(min_sum,cursum);
        }
        return sum_total-min_sum;
    }
    
}