class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(l<=2 || nums[0]==nums[l-1]){
            return 0;
        }
        int first=nums[0];
        int last=nums[l-1];
        int i=1;
        while(i<l){
            if(first!=nums[i]){
                break;
            }
            i++;
        }
        int j=l-2;
        while(j>=0){
            if(last!=nums[j]){
                break;
            }
            j--;
        }
        return j-i+1;
    }
}