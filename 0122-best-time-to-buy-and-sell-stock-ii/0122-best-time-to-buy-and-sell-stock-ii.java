class Solution {
    public int maxProfit(int[] price) {
        int sum=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                sum+=price[i]-price[i-1];
            }
        }
        return sum;
    }
}