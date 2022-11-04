class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>left){
                left=weights[i];
            }
            right+=weights[i];
        }
        while(left<right){
            
            int mid=(left+right)/2;
            System.out.println(mid);
            int cursum=0;
            int need=1;
            for(int i=0;i<weights.length;i++){
                if(cursum+weights[i]>mid){
                    need++;
                    cursum=0;
                }
                cursum+=weights[i];
            }
            if(need>days){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}