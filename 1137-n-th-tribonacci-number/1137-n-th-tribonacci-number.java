class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        while(n>2){
            
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            n--;
        }
        return sum;
    }
}