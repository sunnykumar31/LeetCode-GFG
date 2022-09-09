class Solution {
    public int findPeakElement(int[] nums) {
        int max=(int)-Math.pow(2,31);
        int i=0;
        int index=0;
        while(i<nums.length){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
            i++;
        }
        return index;
    }
}