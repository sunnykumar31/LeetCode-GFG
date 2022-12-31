class Solution {
    int signFunc(int n,int c){
        if(c==0){
            return 0;
        }
        if(n%2!=0){
            return -1;
        }
        return 1;
        
    }
    public int arraySign(int[] nums) {
        int n=0,c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n++;
            }
            else if(nums[i]==0){
                // c=0;
                // break;
                return 0;
            }
        }
        return signFunc(n,c);
    }
}