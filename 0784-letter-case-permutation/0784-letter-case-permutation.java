class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<String>();
        Permutation(s,"",res,0);
        return res;
    }
    public static void Permutation(String s,String ans,List<String> res,int idx){
        if(ans.length()==s.length()){
            res.add(ans);
            return;
        }
        for(int i=idx;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<=9){
                Permutation(s,ans+c,res,i+1);
                // return;
            }
            else{
                Permutation(s,ans+c,res,i+1);
                if(c>='a' && c<='z'){
                    c=(char)(c-32);
                    Permutation(s,ans+c,res,i+1);
                    
                }
                else if(c>='A' && c<='Z'){
                    c=(char)(c+32);
                    Permutation(s,ans+c,res,i+1);
                    
                }
            }
        }
    }
}