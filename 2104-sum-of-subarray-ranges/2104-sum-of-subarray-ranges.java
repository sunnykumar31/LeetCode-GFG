class Solution {
    public long subArrayRanges(int[] A) {
        //Without stack and n^2
        // long sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         sum=sum+(long)(Math.max(nums[i],nums[j])-Math.min(nums[i],nums[j]));
        //     }
        // }
        // return sum;
        
        
        long res = 0;
        for (int i = 0; i < A.length; i++) {
            int max = A[i], min = A[i];
            for (int j = i; j < A.length; j++) {
                max = Math.max(max, A[j]);
                min = Math.min(min, A[j]);
                res += max - min;
            }
        }
        return res;
    }
}