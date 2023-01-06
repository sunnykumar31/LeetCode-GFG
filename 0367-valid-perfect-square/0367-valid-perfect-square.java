class Solution {
    public boolean isPerfectSquare(int num) {
        int i=0;
        int j=num;
        long mid=0;
        while(i<=j){
            mid=j-(j-i)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                j=(int)mid-1;
            }
            else{
                i=(int)mid+1;
            }
        }
        return false;
    }
}