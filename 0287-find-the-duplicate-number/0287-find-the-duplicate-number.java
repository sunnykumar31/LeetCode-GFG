class Solution {
    public int findDuplicate(int[] nums) {
        // #HashMap Method TimeComplexcity(nLogn +n) space(n)
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hp.containsKey(nums[i])) hp.put(nums[i],1);
            else hp.put(nums[i],hp.get(nums[i])+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hp.get(nums[i])>=2) return nums[i]; 
        }
        return 0;
    }
}