class Solution {
    public String reverseVowels(String s) {
        StringBuilder str=new StringBuilder(s);
        char vowel[]={'a', 'e', 'i', 'o','u','A','E', 'I', 'O','U'};
        int i=0;
        int j=s.length()-1;
        int f1=0;
        int f2=0;
        while(i<j){
            char v1=str.charAt(i);
            char v2=str.charAt(j);
            int k=0;
            while(k<10){
                if(v1==vowel[k]){
                    f1=1;
                }
                if(v2==vowel[k]){
                    f2=1;
                }
                if(f1==1 && f2==1){
                    break;
                }
                k++;
            }
            if(f1==0){
                i++;
            }
            if(f2==0){
                j--;
            }
            if(f1==1 && f2==1){
                str.setCharAt(i,v2);
                str.setCharAt(j,v1);
                i++;
                j--;
                f1=0;
                f2=0;
            }
        }
        s=str.toString();
        return s;
    }
}