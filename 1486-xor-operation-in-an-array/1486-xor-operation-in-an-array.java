class Solution {
    public int xorOperation(int n, int start) {
        int xor=start;
        for(int i=1;i<n;i++){
            start+=2;
            xor=xor^start;            
        }
        return xor;
    }
}