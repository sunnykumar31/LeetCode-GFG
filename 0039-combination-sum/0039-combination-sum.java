class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        comb(candidates,target,0,list,ans,0);
        return ans;
    }
    public static void comb(int[] can,int target,int sum,List<Integer> list,List<List<Integer>> ans,int ind){
        if(target==sum){
            ans.add(new ArrayList(list));
            return;
        }
        if(target<sum){
            return;
        }
        for(int i=ind;i<can.length;i++){
            list.add(can[i]);
            comb(can,target,sum+can[i],list,ans,i);
            list.remove(list.size()-1);
        }
    }
}