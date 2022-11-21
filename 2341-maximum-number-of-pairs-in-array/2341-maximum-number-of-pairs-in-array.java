class Solution {
    public int[] numberOfPairs(int[] nums) {
        int l=nums.length;
        int count=0;
        int remainele=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]==-1){}
                else if(nums[i]==nums[j]){
                    nums[i]=-1;
                    nums[j]=-1;
                    count++;
                }
            }
            if(nums[i]!=-1){
                remainele++;
            }
        }
        int ar[]=new int[2];
        ar[0]=count;
        ar[1]=remainele;
        return ar;
    }
}