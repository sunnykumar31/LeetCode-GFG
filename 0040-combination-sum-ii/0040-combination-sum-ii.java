class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int n=candidates.length;
        Arrays.sort(candidates);
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
            if(i!=ind && can[i]==can[i-1]){
                continue;
            }
            else{
                list.add(can[i]);
                comb(can,target,sum+can[i],list,ans,i+1);
                list.remove(list.size()-1);  
            }
        }
    }
}