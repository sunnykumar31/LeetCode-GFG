class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int pos=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int c=columnTitle.charAt(i)-64;
            ans=ans+c*(int)Math.pow(26,pos);
            pos++;
        }
        return ans;
    }
}