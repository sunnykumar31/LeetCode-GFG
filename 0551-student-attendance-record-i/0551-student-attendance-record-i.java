class Solution {
    public boolean checkRecord(String s) {
        int late=0;
        int absent=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                late++;
                if(late>2){
                    return false;
                }
            }
            else if(s.charAt(i)=='A'){
                absent++;
                late=0;
                if(absent>1){
                    return false;
                }
            }
            else{
                late=0;
            }
        }
        return true;
    }
}