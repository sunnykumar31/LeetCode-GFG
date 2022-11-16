class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        while(n>0){
            int rem=n%k;
            sum+=rem;
            n/=k;
        }
        return sum;
    }
}