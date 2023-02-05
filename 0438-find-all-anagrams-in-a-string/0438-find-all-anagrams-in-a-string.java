class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int s_len=s.length();
        int p_len=p.length();
        if(s_len<p_len) return list;
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
            list.add(left);
        }
        while(right<s_len){
            f_s[s.charAt(left)-'a']--;
            f_s[s.charAt(right)-'a']++;
            right++;
            left++;
            if(check(f_s,f_p)){
                list.add(left);
            } 
        }
        return list;
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