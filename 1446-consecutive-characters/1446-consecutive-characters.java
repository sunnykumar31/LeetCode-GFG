class Solution {
    public int maxPower(String s) {
        int count=0;
        int max=0;
        char prev=' ';
       for(int i=0;i<s.length();i++){
           char present=s.charAt(i);
           if(prev==present){
               count++;
           }
           else{
               count=1;
               prev=present;
           }
           max=Math.max(max,count);
       }
        if(count>max){
            max=count;
        }
        return max;
    }
}