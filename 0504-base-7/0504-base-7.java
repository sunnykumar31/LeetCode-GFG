class Solution {
    public String convertToBase7(int num) {
        int base7=0;
        int m=1;
        int temp=num;
        num=Math.abs(num);
        while(num>0){
            int rem=num%7;
            base7+=m*rem;
            m*=10;
            num/=7;
        }
        if(temp<0){
             return "-"+Integer.toString(base7);
            
        }
        return Integer.toString(base7);
    }
}