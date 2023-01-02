class Solution {
    public String freqAlphabets(String s) {
        String str="abcdefghijklmnopqrstuvwxyz";
        int len=s.length();
        String st="";
        
        while(len!=0){
            if(s.charAt(len-1)=='#'){
                String str2=s.substring(len-3,len-1);
                int index=Integer.parseInt(str2);
                st=str.substring(index-1,index)+st;
                len=len-3;
            }
            else{
                String str2=s.substring(len-1,len);
                int index=Integer.parseInt(str2);
                st=str.substring(index-1,index)+st;
                len--;
            }
        }
        return st;
    }
}