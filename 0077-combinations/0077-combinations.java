class Solution {
     public static void permutation(boolean board[],int n,List<Integer> list,List<List<Integer>> ans,int len, int k,int ind){
        if(len==k){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=ind;i<=n;i++){
            if(board[i-1]==false){
                board[i-1]=true;
                list.add(i);
                permutation(board,n,list,ans,len+1,k,i);
                list.remove(list.size()-1);
                board[i-1]=false;
            }
            
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean board[]=new boolean[n];
        permutation(board,n,list,ans,0,k,1);
        return ans;    
    }
}