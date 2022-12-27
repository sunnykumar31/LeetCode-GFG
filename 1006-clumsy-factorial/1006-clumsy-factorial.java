class Solution {
    public int clumsy(int n) {
        //Whithout stack
        if(n==1) return n;
        if(n==2) return n*(n-1);
        if(n==3) return n*(n-1)/(n-2);
        int copy=n;
        int curr=0;
        int op=4;
        int ans=n*(n-1)/(n-2)+(n-3);
        n-=3;
        for(int i=n-1;i>0;){
            if(op%4==1) curr*=i;
            else if(op%4==2) curr/=i;
            else if(op%4==3){
                curr+=i;
                ans+=curr;
                curr=0;
            }
            else curr-=i;
            op++;
            i--;
        }
        if(copy%4!=0) ans+=curr;
        return ans;
    }
}