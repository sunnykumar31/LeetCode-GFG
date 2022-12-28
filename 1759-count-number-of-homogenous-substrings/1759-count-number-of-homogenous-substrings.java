class Solution {
    public int countHomogenous(String s) {
        int j=0,i=0;
        int l=s.length();
        int sum=0;
        int n=1;
        while(j<l){
            if(s.charAt(i)!=s.charAt(j)){
                n=1;
                i=j;
            }
            sum=(sum+n)%1000000007;
            j++;
            n++;
        }
        // int n=j-i;
        // // n=n%1000000007;
        // // sum=sum%1000000007;
        // sum=(sum+(n*(n+1))/2)%1000000007;
        
        return sum;
    }
}