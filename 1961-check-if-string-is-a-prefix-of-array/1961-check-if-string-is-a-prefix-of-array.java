class Solution {
    public boolean isPrefixString(String s, String[] w) {
        int count=0;
        int S_len=s.length();
        String pref="";
        for(int i=0;i<w.length;i++){
            count+=w[i].length();
            if(count<=S_len){
                pref+=w[i];
                if(count==S_len){
                    if(pref.equals(s)){
                        return true;
                    }
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
}