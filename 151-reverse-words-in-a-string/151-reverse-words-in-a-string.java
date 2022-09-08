class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+", " ");
        s=s.trim();
        int len=s.length();
        String finalstr="";
        String temp="";
        
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)==' '){
                finalstr=finalstr+temp+" "; //store reverse of sentance
                temp="";
            }
            else{
                temp=s.charAt(i)+temp;
            }
             // store word
        }
        finalstr=finalstr+temp; // store last word 
        // finalstr=finalstr.replaceAll("\\s+", " "); //replace more than 2 space to in between the sentance
        // finalstr=finalstr.trim(); // remove the extra space from start and end
        return finalstr;
    }
}