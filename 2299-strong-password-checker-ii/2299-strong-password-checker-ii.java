class Solution {
    public boolean strongPasswordCheckerII(String p) {
        if(p.length()<8){
            return false;
        }
        int ans[]=new int[4];
        String sp="!@#$%^&*()-+";
        for(int i=0;i<p.length();i++){
            if(i!=p.length()-1 && p.charAt(i)==p.charAt(i+1)){
                return false;
            }
            if(p.charAt(i)>='a' && p.charAt(i)<='z'){
                ans[0]++;
            }
            else if(p.charAt(i)>='A' && p.charAt(i)<='Z'){
                ans[1]++;
            }
            else if(p.charAt(i)>='0' && p.charAt(i)<='9'){
                ans[2]++;
            }
            else{
                for(int j=0;j<sp.length();j++){
                    if(p.charAt(i)==sp.charAt(j)){
                        ans[3]++;
                    }
                }
            }
            
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0){
                return false;
            }
        }
        return true;
        
    }
}