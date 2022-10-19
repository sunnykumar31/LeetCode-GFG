class Solution {
    public static void subset(int nums[],List<Integer> list,List<List<Integer>> ans,int ind){
        // if(ind<nums.length){
        //     ans.add(new ArrayList(list));
        // }
        if(ind==nums.length){
            ans.add(new ArrayList(list));
            // list.remove(list.size()-1);
            return;
        }
        // for(int i=ind;i<nums.length;i++){
        //     if(board[i]==false){
        //         board[i]=true;
        //         list.add(nums[i]);
        //         subset(board,nums,list,ans,i+1);
        //         board[i]=false;
        //     }
        // }
        list.add(nums[ind]);
        subset(nums,list,ans,ind+1);
        list.remove(list.size()-1);
        subset(nums,list,ans,ind+1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        // boolean board[]=new boolean[nums.length];
        subset(nums,list,ans,0);
        return ans;
    }
}