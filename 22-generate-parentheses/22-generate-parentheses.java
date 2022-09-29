class Solution {
    public static void parenthesis(int n,int open,int close,String ans,List<String> l){
        if(open==n&& close==n){
            l.add(ans);
            return;
        }
        if(open<n){
            parenthesis(n,open+1,close,ans+"(",l);
        }
        if(close<open){
            parenthesis(n,open,close+1,ans+")",l);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> l=new ArrayList<>();
        String ans="";
        parenthesis(n,0,0,ans,l);
        return l;
    }
}