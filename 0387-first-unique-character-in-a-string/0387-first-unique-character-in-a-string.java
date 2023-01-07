class Solution {
    public int firstUniqChar(String s) {
        int ar[]=new int[26];
        int len=s.length();
        for(int i=0;i<len;i++){
            ar[s.charAt(i)-97]++;
        }
        for(int i=0;i<len;i++){
            if(ar[s.charAt(i)-97]==1) return i;
        }
        return -1;
        
        
    }
}