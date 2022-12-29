class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        boolean count_board[]=new boolean[10];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        CombinationIII(count_board,k,n,list,ans,0,1);
        return ans;
    }
    public static void CombinationIII(boolean[] count_board,int k,int n,List<Integer> list,List<List<Integer>> ans,int count,int idx){
        if(count==k && n==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(count>k){
            return;
        }
        for(int i=idx;i<10;i++){
            if(n>=i){
                if(count_board[i]==false){
                    count_board[i]=true;
                    list.add(i);
                    CombinationIII(count_board,k,n-i,list,ans,count+1,i);
                    list.remove(list.size()-1);
                    count_board[i]=false;
                }
            }
        }
    }
    
}