class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        return Math.max(nums[0]*nums[1]*nums[l-1],nums[l-1]*nums[l-2]*nums[l-3]);
        //Explaniation ex after sorting -a,-b,-c,d,e,f
        // maximum always (-a*-b*d) or (d*e*f) 
    }
}