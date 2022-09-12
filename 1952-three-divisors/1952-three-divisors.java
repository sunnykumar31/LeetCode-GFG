class Solution {
    public boolean isThree(int n) {
        int count=2;
        int i=2;
        while(i<n){
            if(n%i==0){
                count++;
                // if(n/i>i){
                //     count++;
                // } 
            }
            if(count>3){
                return false;
            }
            i++;
        }
        if(count==3){
            return true;
        }
        return false;
    }
}