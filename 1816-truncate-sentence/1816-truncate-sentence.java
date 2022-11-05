class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                count++;
            }
            if(count==k){
                return s.substring(0,i);
            }
        }
        return s;
    }
}