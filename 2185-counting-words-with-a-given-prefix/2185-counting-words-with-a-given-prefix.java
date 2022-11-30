class Solution {
    public int prefixCount(String[] w, String pref) {
        int count=0;
        int pref_len=pref.length();
        for(int i=0;i<w.length;i++){
            if(w[i].length()>=pref_len){
                if(pref.equals(w[i].substring(0,pref_len))){
                    count++;
                }
            }
        }
        return count;
    }
}