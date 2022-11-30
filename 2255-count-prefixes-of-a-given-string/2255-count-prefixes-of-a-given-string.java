class Solution {
    public int countPrefixes(String[] w, String s) {
        int count=0;
        int pref_len=s.length();
        for(int i=0;i<w.length;i++){
            if(w[i].length()<=pref_len){
                if(w[i].equals(s.substring(0,w[i].length()))){
                    count++;
                }
            }
        }
        return count;
    }
}