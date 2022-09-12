class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String s1=sentences[i];
            String[] words=s1.split("\\s");
            int count=0;
            for(String w:words){  
                count++;
            }  
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}