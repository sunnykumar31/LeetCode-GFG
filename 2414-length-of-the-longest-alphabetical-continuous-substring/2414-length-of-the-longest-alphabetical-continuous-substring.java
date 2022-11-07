class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)-s.charAt(i)==1){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=1;
            }
        }
        if(count>max){
            max=count;
        }
        return max;
    }
}