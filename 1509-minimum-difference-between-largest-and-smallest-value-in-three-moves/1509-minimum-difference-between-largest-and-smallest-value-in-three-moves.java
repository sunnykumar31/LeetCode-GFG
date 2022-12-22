class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(l<5){
            return 0;
        }
            //kill 3 biggest elements
            // kill 2 biggest elements + 1 smallest elements
            // kill 1 biggest elements + 2 smallest elements
            // kill 3 smallest elements
            // soch to liya tha implementation dimag m nhi aar rha tha to ye explation jada acha lga help from discuss
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            ans=Math.min(ans,nums[l-4+i]-nums[i]);
        }
        return ans;
    }
}