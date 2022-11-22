class Solution {
    public int sumOfUnique(int[] nums) {
        int ar[]=new int[101];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(ar[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}