class Solution {
    public int strStr(String haystack, String needle) {
        int len_ndl=needle.length();
        int len_hystk=haystack.length();
        if(len_ndl==0){
            return 0;
        }
        for(int i=0;i<len_hystk;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int last_index=i+len_ndl;
                if(last_index>len_hystk){
                    return -1;
                }
                String tempstring="";
                tempstring=haystack.substring(i,last_index);
                
                if(needle.equals(tempstring)){
                    return i;
                }
            }
        }
        return -1;
    }
}