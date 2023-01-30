class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subsetII(nums,0,list,ans);
        return ans;
    }
    private static void subsetII(int nums[],int idx,List<Integer> list,List<List<Integer>> ans){
        ans.add(new ArrayList(list));
        for(int i=idx;i<nums.length;i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            subsetII(nums,i+1,list,ans);
            list.remove(list.size()-1);
        }
    }
}