class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        int f=1;
        while(f==1){
            f=0;
            if(n%2==0){
                n/=2;
                f=1;
            }
            if(n%3==0){
                n/=3;
                f=1;
            }
            if(n%5==0){
                n/=5;
                f=1;
            }
        }
        if(n==1){
            return true;
        }
        return false;
    }
}