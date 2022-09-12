class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            sb.append(c);
            char c1=s.charAt(i+1);
            int n=c+c1-48;
            char c3=(char)n;
            // System.out.println(c3);
            // s.replace(c1,c3);
            sb.append(c3);
            i++;
        }
        if(s.length()%2!=0)
            sb.append(s.charAt(s.length()-1));
        s=sb.toString();
        return s;
    }
}