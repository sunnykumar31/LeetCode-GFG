class Solution {
    public boolean areOccurrencesEqual(String s) {
        int ar[]=new int[26];
        int index=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ar[c-97]++;
            index=c-97;
        }
        for(int i=0;i<26;i++){
            if(ar[i]==0){}
            else if(ar[index]!=ar[i]){
                return false;
            }
        }
        return true;
    }
}