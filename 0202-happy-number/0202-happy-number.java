class Solution {
    int squaresum(int x){
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum+(rem*rem);
            x=x/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int c=9;
        while(c!=0){
            int l=squaresum(n);
            if(l==1){
                return true;
            }
            n=l;
            c--;
        }
        return false;
    }
}