class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        String s3="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                s3=s3+s1.charAt(i)+s2.charAt(i);
                
            }
        }
        if(c==0)
            return true;
        if(c==2 && (s3.charAt(0)==s3.charAt(3))){
            if(s3.charAt(1)==s3.charAt(2)){
                return true;
            }
        }
        return false;
    }
}