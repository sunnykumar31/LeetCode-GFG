class Solution {
    public boolean isAnagram(String s, String t) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}