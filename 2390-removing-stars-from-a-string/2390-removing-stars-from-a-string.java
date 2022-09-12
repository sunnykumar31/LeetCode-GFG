class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                count++;
            }
            else{
                if(count==0){
                    sb.append(s.charAt(i));
                }
                else{
                    
                    sb.delete(sb.length()-count,sb.length());
                    sb.append(s.charAt(i));
                    count=0;
                }
            }
        }
        if(count!=0){
            sb.delete(sb.length()-count,sb.length());
        }
        s=sb.toString();
        return s;
    }
}