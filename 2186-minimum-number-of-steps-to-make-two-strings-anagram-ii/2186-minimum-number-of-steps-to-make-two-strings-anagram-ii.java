class Solution {
    public int minSteps(String s, String t) {
        int freq1[]=new int [26];
        int freq2[]=new int [26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            int diff=Math.abs(freq1[i]-freq2[i]); // dono k charater ko bina change kiye anagram bnanan hai  
            if(diff!=0){
                count+=diff;
            }
        }
        return count;
    }
}