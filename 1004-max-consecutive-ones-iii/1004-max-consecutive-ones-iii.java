class Solution {
    public int longestOnes(int[] nums, int k) {
        //brute force
        int max=0;
        for(int i=0;i<nums.length-max;i++){
            int count=0;
            int n=k;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    n--;
                }
                if(n==-1){
                    break;
                }
                count++;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}