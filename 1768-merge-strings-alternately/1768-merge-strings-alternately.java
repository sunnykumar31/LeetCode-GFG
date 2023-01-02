class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int l1=word1.length();
        int l2=word2.length();
        if(l1<=l2){
            int i;
            for(i=0;i<l1;i++){
                s=s+word1.charAt(i)+word2.charAt(i);
            }
            for(int j=i;j<l2;j++){
                s=s+word2.charAt(j);
            }
        }
        else{
            int i;
            for(i=0;i<l2;i++){
                s=s+word1.charAt(i)+word2.charAt(i);
            }
            for(int j=i;j<l1;j++){
                s=s+word1.charAt(j);
            }
        }
        return s;
        
    }
}