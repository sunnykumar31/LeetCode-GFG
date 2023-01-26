class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hp.put(nums[i],0);
            }
        }
        int j=1;
        while(j<=100000){
            if(!hp.containsKey(j)){
                return j;
            }
            j++;
        }
        return j;
    }
}