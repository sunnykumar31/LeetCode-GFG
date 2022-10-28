class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                s=s.replaceFirst("6","9");
                return Integer.valueOf(s); 
            }
        }
        return num;
        
    }
}