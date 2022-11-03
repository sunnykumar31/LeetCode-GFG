class Solution {
    public boolean isUgly(int n) {
        // my approch
        
        // if(n==0){
        //     return false;
        // }
        // int f=1;
        // while(f==1){
        //     f=0;
        //     if(n%2==0){
        //         n/=2;
        //         f=1;
        //     }
        //     if(n%3==0){
        //         n/=3;
        //         f=1;
        //     }
        //     if(n%5==0){
        //         n/=5;
        //         f=1;
        //     }
        // }
        // if(n==1){
        //     return true;
        // }
        // return false;
        
        
        
        // learned from submission
        if(n==0){
            return false;
        }
        
        while(n%30==0){
            n/=30;
        }
        while(n%15==0){
            n/=15;
        }
        while(n%10==0){
            n/=10;
        }
        while(n%6==0){
            n/=6;
        }
        while(n%5==0){
            n/=5;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%2==0){
            n/=2;
        }
        
        return n==1;
    }
}