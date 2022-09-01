class Solution {
    public int mySqrt(int x) {
        long si=0;
        long ei=x;
        int ans=0;
        while(si<=ei){
            long mid=ei-(ei-si)/2;
            if(mid*mid<=x){
                ans=(int)mid;
                si=mid+1;
            }
            else{
                ei=mid-1;
                
            }
        }
        return ans;
    }
}