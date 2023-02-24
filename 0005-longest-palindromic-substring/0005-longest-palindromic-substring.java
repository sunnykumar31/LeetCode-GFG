class Solution {
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length() && i+j<s.length() && i-j>=0;j++){
                if(s.charAt(i+j)!=s.charAt(i-j)){
                    break;
                }
                else{
                    if(max<i+j-(i-j)+1){
                        max=i+j-(i-j)+1;
                        start=i-j;
                        end=i+j;
                    }
                }
            }
        }
        for(double i=0.5;i<s.length();i++){
            for(double j=0.5;j<s.length() && i+j<s.length() && i-j>=0;j++){
                if(s.charAt((int)(i+j))!=s.charAt((int)(i-j))){
                    break;
                }
                else{
                    if(max<(int)(i+j-(i-j)+1)){
                        max=(int)(i+j-(i-j)+1);
                        start=(int)(i-j);
                        end=(int)(i+j);
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}