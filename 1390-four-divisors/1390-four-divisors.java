class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        int totsum=0;
        int len=nums.length;
        for(int j=0;j<len;j++){
            int n=nums[j];
            int count=2;
            int i=2;
            sum=1+n;
            while(i<=Math.sqrt(n)){
                if(n%i==0){
                    count++;
                    sum=sum+i;
                    if(n/i>i){
                        sum=sum+n/i;
                        count++;
                    } 
                }
                if(count>4){
                    sum=0;
                    break;
                }
                i++;
            }
            if(count==4){
                totsum+=sum;
            }
        }
        return totsum;
    }
}