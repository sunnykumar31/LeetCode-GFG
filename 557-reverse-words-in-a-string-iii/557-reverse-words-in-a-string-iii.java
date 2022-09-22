class Solution {
    public String reverseWords(String s) {
        String s1="",s2="";
        for(int i=0;i<s.length();i++){
            if(s.length()==i+1){
                s2=s2+s.charAt(i)+s1;
            }
            else if(s.charAt(i)==' '){
                s2=s2+s1+' ';
                s1="";
            }
            
            else{
                s1=s.charAt(i)+s1;
            }
        }
        return s2;
    }
}