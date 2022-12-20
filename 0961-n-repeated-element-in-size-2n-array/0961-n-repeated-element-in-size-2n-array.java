class Solution {
    public int repeatedNTimes(int[] nums) {
        int ar[]=new int[10001];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        for(int j=0;j<10001;j++){
            if(ar[j]==nums.length/2){
                return j;
            }
        }
        return -1;
    }
}