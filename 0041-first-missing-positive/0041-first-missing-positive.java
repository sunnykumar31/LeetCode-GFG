class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        int j=1;
        while(j<=set.size()){
            if(!set.contains(j)){
                return j;
            }
            j++;
        }
        return j;
    }
}