class Solution {
    public static long sqrt(int c){
        long i=0;
        long j=c;
        long mid=0;
        long ans=0;
        while(i<=j){
            mid=i+(j-i)/2;
            if(mid*mid<=c){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    public boolean judgeSquareSum(int c) {
        long root=sqrt(c);
        long a=0;
        long b=root;
        while(a<=root){
            long val=a*a + b*b;
            if(val==c){
                return true;
            }
            else if(val<c){
                a++;
            }
            else{
                b--;
            }
        }
        return false;
        
    }
}