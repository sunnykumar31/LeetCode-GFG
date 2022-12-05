class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==original){
                    original*=2;
                    f=1;
                }
            }
            if(f==0){
                return original;
            }
        }
        return original;
    }
}