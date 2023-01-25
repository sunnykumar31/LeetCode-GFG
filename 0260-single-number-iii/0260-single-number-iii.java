class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        int ar[]=new int[2];
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        int tempAns=ans;
        int pos=0;
        while(tempAns!=0){
            if((tempAns&1)==1){
                break;
            }
            tempAns=tempAns>>1;
            pos++;
        }
        int temp=ans;
        for(int i=0;i<nums.length;i++){
            if(((nums[i]>>pos)&1)==1){
                temp=temp^nums[i];
            }
        }
        ar[0]=temp;
        ar[1]=temp^ans;
        return ar;
    }
}