class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ar1[]=new int[26];
        int ar2[]=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            ar1[ransomNote.charAt(i)-97]++;
        }
        for(int i=0;i<magazine.length();i++){
            ar2[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(ar1[i]>ar2[i]) return false;
        }
        return true;
    }
}