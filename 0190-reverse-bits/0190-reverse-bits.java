public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            int lsb=n&1;//finding the bit of lsb place 
            lsb=lsb<<(31-i);//then sifting 
            ans=ans|lsb;// doing or to save ans 
            n=n>>1;//then sifting n to right and reepeating the proccess;
        }
        return ans;
    }
}