class Solution {
    public boolean checkPowersOfThree(int n) {
        int temp=1;
        int count=0;
        while(temp<=n){
            temp*=3;
            count++;
        }
        n=n-(temp/3);
        temp=(int)Math.pow(3,count-2);
        while(count!=0){
            if(temp==n){
                return true;
            }
            else if(temp<n){
                n-=temp;
            }
            temp/=3;
            count--;
        }
        return false;
        
    }
}