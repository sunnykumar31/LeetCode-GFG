class Solution {
    public int compress(char[] chars) {
        int count=0;
        int c=1;
        // int idx=0;
        int i=0;
        for(;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                c++;
            }
            else if(c>1){
                chars[count]=chars[i];
                count++;
                String s=Integer.toString (c);
                int j=0;
                while(j<s.length()){
                    chars[count]=s.charAt(j);
                    count++;
                    j++;
                }
                c=1;
            }
            else{
                chars[count]=chars[i];
                count++;
            }
        }
        if(chars.length==1 || chars[i-1]!=chars[i]){
            chars[count]=chars[i];
            count++;
        }
        else{
            chars[count]=chars[i];
            count++;
            String s=Integer.toString (c);
                int j=0;
                while(j<s.length()){
                    chars[count]=s.charAt(j);
                    count++;
                    j++;
                }
        }
        return count;
    } 
}