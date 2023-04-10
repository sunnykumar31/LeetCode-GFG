class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        String digitString[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder();
        combination(digits,digitString,sb,ans,0);
        return ans;
    }
    public static void combination(String digits,String digitString[],StringBuilder sb,List<String> ans,int j){
        if(j==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String s=digitString[digits.charAt(j)-50];
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            combination(digits,digitString,sb,ans,j+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}