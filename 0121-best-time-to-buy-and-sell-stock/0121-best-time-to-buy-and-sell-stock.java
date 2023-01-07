class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ar[] = new int[n];
        ar[n-1] = prices[n-1];
        for(int i = n-2;i>=0;i--){
            ar[i] = Math.max(prices[i],ar[i+1]);
        }
        int m = 0;
        for(int i = 0;i<n;i++){
            int d = ar[i] - prices[i];
            if(d>m) m = d;
        }
        return m;
    }
}