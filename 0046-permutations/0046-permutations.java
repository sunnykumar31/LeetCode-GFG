class Solution {
    public static void permutation(boolean board[],int nums[],List<Integer> list,List<List<Integer>> ans,int len){
        if(len==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(board[i]==false){
                board[i]=true;
                list.add(nums[i]);
                permutation(board,nums,list,ans,len+1);
                list.remove(list.size()-1);
                board[i]=false;
            }
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean board[]=new boolean[nums.length];
        permutation(board,nums,list,ans,0);
        return ans;
    }
}