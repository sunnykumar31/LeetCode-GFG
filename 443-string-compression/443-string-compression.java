class Solution {
    public int compress(char[] chars) {
        int len=chars.length;
        if(len==1){
            return 1;
        }
        StringBuilder sb=new StringBuilder();
        int j=0;
        int count=1;
        for(int i=1;i<len;i++){
            if(chars[j]==chars[i]){
                count++;
            }
            else{
                sb.append(chars[j]);
                j=i;
                if(count!=1){
                    String s=Integer.toString(count);
                    int lenofcount=s.length();
                    int k=0;
                    while(lenofcount>k){
                        sb.append(s.charAt(k));
                        k++;
                    }
                }
                count=1;
            }
        }
        if(count==1){
            sb.append(chars[len-1]);
        }
        else{
            sb.append(chars[j]);
            String s=Integer.toString(count);
            int lenofcount=s.length();
            int k=0;
            while(lenofcount>k){
                sb.append(s.charAt(k));
                k++;
            }
        }
        int l=sb.length();
        for(int i=0;i<l;i++){
            chars[i]=sb.charAt(i);
        }
        return l;
    }
}