class Solution {
    public static int countVowel(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' || c1=='A' || c1=='E' || c1=='I' ||                  c1=='O' || c1=='U')count++;
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        String pre=s.substring(0,len/2);
        String post=s.substring(len/2,len);
        // System.out.println(pre+" "+post);
        if(countVowel(pre)==countVowel(post)){
            return true;
        }
        return false;
    }
}