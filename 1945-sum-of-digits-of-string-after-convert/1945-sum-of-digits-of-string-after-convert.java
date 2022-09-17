class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=c-96;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
        }
        while(k>1){
            int n=sum;
            sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            k--;
        }
        return sum;
    }
}