class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char c=blocks.charAt(i);
            if(c=='W'){
                count++;
            }
        }
        int newcount=count;
        int post=k;
        int pre=0;
        while(post<blocks.length()){
            char pre_char=blocks.charAt(pre);
            if(pre_char=='W'){
                newcount--;
            }
            char post_char=blocks.charAt(post);
            if(post_char=='W'){
                newcount++;
            }
            pre++;
            post++;
            if(newcount<count){
                count=newcount;
            }
        }
        return count;
    }
}