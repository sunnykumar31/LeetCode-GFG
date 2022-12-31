public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // System.out.println(n);
        int c = 0;
        // if(n>=0){
        //     while(n>0){
        //         if(n%2==1){
        //             c++;
        //         }
        //         n = n/2;
        //     }
        // }
        // else{
        //     n=2147483647+n;
        //     n=n+1;
        //     while(n>0){
        //         if(n%2==1){
        //             c++;
        //         }
        //         n = n/2;
        //     }
        //     c++;
        // }
        
        while(n!=0){
                if((n&1)==1){
                    c++;
                }
                n = n>>>1;
            }
        
        return c;
    }
}