class Solution {
    public char findTheDifference(String s, String t) {
        char t1[]=t.toCharArray();
        Arrays.sort(t1);
        char s1[]=s.toCharArray();
        Arrays.sort(s1);
        for(int i=0;i<s.length();i++){
            if(s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[t.length()-1];
    }
}