class NumArray {
//     List<Integer> list=new ArrayList<>();
//     public NumArray(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             list.add(nums[i]);
//         }
//     }
    
//     public int sumRange(int left, int right) {
//         int sum=0;
//         for(int i=left;i<=right;i++){
//             sum+=list.get(i);
//         }
//         return sum;
//     }
    
    int sum[];
    public NumArray(int[] nums) {
        sum=new int[nums.length+1];
        sum[0]=0;
        for(int i=1;i<nums.length+1;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return sum[right+1]-sum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */