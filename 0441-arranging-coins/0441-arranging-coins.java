class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int j=n;
        long mid=0;
        while(i<=j){
            mid=j-(j-i)/2;
            long sum=(mid*(mid+1))/2;
            if(sum<=n){
                i=(int)mid+1;
            }
            else{
                j=(int)mid-1;
            }
        }
        return (int)i-1;
    }
}