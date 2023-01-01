class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return;
        }
        int ar[] = new int[nums.length];
        int n = nums.length;
        int c = 0;
        int b = n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ar[b] = 0;
                b--;
                
            }
            else{
                ar[c] = nums[i];
                c++;
            }
        }
        for(int i = 0;i<n;i++){
            nums[i] = ar[i];
        }
        return;
    }
}