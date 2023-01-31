class Solution {
public static void permutation(boolean board[],int nums[],List<Integer> list,List<List<Integer>> ans,int len){
        if(list.size()==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            // if(board[i]==false){
            if(board[i] || i > 0 && nums[i] == nums[i-1] && !board[i - 1]) continue;
                board[i]=true;
                list.add(nums[i]);
                permutation(board,nums,list,ans,len);
                list.remove(list.size()-1);
                board[i]=false;
            // }
            
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean board[]=new boolean[nums.length];
        permutation(board,nums,list,ans,0);
        return ans;
    }
}