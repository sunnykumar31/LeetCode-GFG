class Solution {
    public String interpret(String command) {
        String s="";
        int length=command.length();
        int i=0;
        while(i<length){
            if(command.charAt(i)=='G'){
                s=s+'G';
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                s=s+'o';
                i=i+2;
            }
            else{
                s=s+'a'+'l';
                i=i+4;
            }
        }
        return s;
    }
}