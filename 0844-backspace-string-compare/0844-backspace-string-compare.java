class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=remove(s).trim();
        String t1=remove(t).trim();
        // System.out.println(s1+" "+t1);
        return s1.equals(t1);
    }
    public static String remove(String s){
        char str[]=s.toCharArray();
        int j=0;
        for(int i=0;i<str.length;i++){
            str[j]=str[i];
            if(j>0 && str[i]=='#'){
                j-=2;
            }
            j++;
        }
        int start=0;
        for(int i=0;i<j;i++){
            if(str[i]=='#') str[i]=' ';
            else break;
        }
        
        return new String(str,start,j);
    }
}