class Solution {
    public int commonFactors(int a, int b) {
        int count=1;
        int i=2;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
}