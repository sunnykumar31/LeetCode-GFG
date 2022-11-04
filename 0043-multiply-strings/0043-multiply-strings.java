class Solution {
    public String multiply(String num1, String num2) {
        int len1=num1.length();
        int len2=num2.length();
        //simple multiply rule follow 12
                                //    45
                                //    --
                                //    60
                                //   480
                                //   ---
                                //   540
        int ar[]=new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            int n1=num1.charAt(i)-'0';
            for(int j=len2-1;j>=0;j--){
                int n2=num2.charAt(j)-'0';
                int mul=n1*n2;
                int p1=i+j;
                int p2=i+j+1;
                int val=mul+ar[p2];
                ar[p1]+=val/10;
                ar[p2]=val%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        int index=0;
        // for excluding leading zero ex 45*0=000 ans will give 000 but we excluding 000 and simple return 0
        // next ex 2*3 will give 06 wee have to exlude leading zero 
        for(int i=0;i<len1+len2;i++){
            if(ar[i]!=0){
                break;
            }
            index++;
        }
        for(int i=index;i<len1+len2;i++){
            sb.append(ar[i]);
        }
        if(sb.length()==0){
            return "0";
        }
        String finalmul=sb.toString();
        return finalmul;
    }
}