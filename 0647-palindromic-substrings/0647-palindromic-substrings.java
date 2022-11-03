class Solution {
    public int countSubstrings(String s) {
        //Without dyanamic Programming 
        int len=s.length();
        int count=0;
        // example s=aaa  palindormic string from odd loop a,a,a,aaa
        for(int i=0;i<len;i++){
            int pre=i;
            int post=i;
            while(pre>=0 && post<len){
                char c_pre=s.charAt(pre);
                char c_post=s.charAt(post);
                if(c_pre!=c_post){
                    break;
                }
                pre--;
                post++;
                count++;
            }
        }
        // palindromic from even loop aa aa
        for(double i=0.5;i<len;i++){
            int pre=(int)(i-0.5);
            int post=(int)(i+0.5);
            while(pre>=0 && post<len){
                char c_pre=s.charAt(pre);
                char c_post=s.charAt(post);
                if(c_pre!=c_post){
                    break;
                }
                pre--;
                post++;
                count++;
            }
        }
        return count;
        
    }
}