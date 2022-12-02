class Solution {
    public boolean closeStrings(String word1, String word2) {
        int freq1[]=new int [26];
        int freq2[]=new int [26];
        for(int i=0;i<word1.length();i++){ //frequency array
            freq1[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            freq2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){  // checking if character is only in one of them then return true;
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0)){
                return false;
            }
        }
        for(int i=0;i<26;i++){  // if existing character in both then checking frequency will be same
            int f=0;
            for(int j=0;j<26;j++){
                if(freq1[i]==freq2[j]){
                    freq2[j]=-1;
                    f=1;
                    break;
                }
            }
            if(f==0){
                return false;
            }
        }
        return true;
    }
}