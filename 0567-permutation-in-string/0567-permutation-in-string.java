class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String s=s2;
        String p=s1;
        int s_len=s.length();
        int p_len=p.length();
        if(s_len<p_len) return false;
        int f_s[]=new int[26];
        int f_p[]=new int[26];
        int left=0;
        int right=0;
        while(right<p_len){
            f_s[s.charAt(right)-'a']++;
            f_p[p.charAt(right)-'a']++;
            right++;
        }
        if(check(f_s,f_p)){
            return true;
        }
        while(right<s_len){
            f_s[s.charAt(left)-'a']--;
            f_s[s.charAt(right)-'a']++;
            right++;
            left++;
            if(check(f_s,f_p)){
                return true;
            } 
        }
        return false;
    }
    public static boolean check(int f_s[],int f_p[]){
        for(int i=0;i<26;i++){
            if(f_s[i]!=f_p[i]){
                return false;
            }
        }
        return true;
    }
    
}