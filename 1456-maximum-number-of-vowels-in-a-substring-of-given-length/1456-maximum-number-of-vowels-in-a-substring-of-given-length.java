class Solution {
    public int maxVowels(String s, int k) {
        //it don't feel that this code is effecient;
        // int count=0;
        // String vowel="aeiou";
        // for(int i=0;i<k;i++){
        //     String c=s.substring(i,i+1);
        //     if(vowel.contains(c)){
        //         count++;
        //     }
        // }
        // int newcount=count;
        // int post=k;
        // int pre=0;
        // while(post<s.length()){
        //     String pre_char=s.substring(pre,pre+1);
        //     if(vowel.contains(pre_char)){
        //         newcount--;
        //     }
        //     String post_char=s.substring(post,post+1);
        //     if(vowel.contains(post_char)){
        //         newcount++;
        //     }
        //     pre++;
        //     post++;
        //     if(newcount>count){
        //         count=newcount;
        //     }
        // }
        // return count;
        
        //by the help of frequency array
        int len=s.length();
        boolean vowel[]=new boolean[len];
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel[i]=true;
            }
        }
        int count=0;
        for(int i=0;i<k;i++){
            if(vowel[i]){
                count++;
            }
        }
        int newcount=count;
        int post=k;
        int pre=0;
        while(post<s.length()){
            if(vowel[pre]){
                newcount--;
            }
            if(vowel[post]){
                newcount++;
            }
            pre++;
            post++;
            if(newcount>count){
                count=newcount;
            }
        }
        return count;
        
    }
}