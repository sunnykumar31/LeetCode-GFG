class Solution {
    public static int Max(int[] ar){
        int max=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
    public int numIdenticalPairs(int[] nums) {
        int max=Max(nums);
        int ar[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        int count=0;
        for(int i=0;i<max+1;i++){
            if(ar[i]>1){
                count+=((ar[i])*(ar[i]-1))/2;
            }
        }
        return count;
    }
}