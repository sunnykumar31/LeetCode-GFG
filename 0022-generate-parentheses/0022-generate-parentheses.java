class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        combination(n,0,0,ans,"");
        return ans;
    }
    public static void combination(int n,int open,int close,List<String> ans,String s){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            combination(n,open+1,close,ans,s+"(");
        }
        if(close<open){
            combination(n,open,close+1,ans,s+")");
        }
    }
}