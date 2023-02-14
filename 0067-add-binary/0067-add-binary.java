class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int la=a.length()-1;
        int lb=b.length()-1;
        while(la>=0 && lb>=0){
            int na=a.charAt(la)-48;
            int nb=b.charAt(lb)-48;
            int s=na+nb+carry;
            if(s>1) carry=1;        
            else carry=0;
            sb.append(s%2);
            la--;
            lb--;
        }
        while(la>=0){
            int na=a.charAt(la)-48;
            int s=na+carry;
            if(s>1) carry=1;
            else carry=0;
            sb.append(s%2);
            la--;
        }
        while(lb>=0){
            int nb=b.charAt(lb)-48;
            int s=nb+carry;
            if(s>1) carry=1;   
            else carry=0;
            sb.append(s%2);
            lb--;
        }
        if(carry!=0) sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}