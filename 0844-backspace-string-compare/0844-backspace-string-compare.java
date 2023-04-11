class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=remove(s);
        String t1=remove(t);
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
        
        // why use this you can understand by this example "y#fo##f"
                                                                // "y#f#o##f"
        int i=0;
        for(;i<j;i++){
            if(str[i]=='#');
            else break;
        }
        System.out.print(j);
        return new String(str,i,j-i);
    }
}