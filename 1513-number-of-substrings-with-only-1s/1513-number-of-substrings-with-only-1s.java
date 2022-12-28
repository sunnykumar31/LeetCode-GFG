class Solution {
    public int numSub(String s) {
        int l=s.length();
        int sum=0;
        int n=1;
        for(int j=0;j<l;j++){
            if(s.charAt(j)=='0'){
                n=1;
                continue;
            }
            sum=(sum+n)%1000000007;
            n++;
        }     
        return sum;
    }
}