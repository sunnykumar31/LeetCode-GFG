class Solution {
    public int divisorSubstrings(int num, int k) {
        //String approch
        String s=String.valueOf(num);
        int count=0;
        for(int i=0;i<s.length()-k+1;i++){
            String temp=s.substring(i,i+k);
            int n1=Integer.valueOf(temp); 
            if(n1==0){
                continue;
            }
            if(num%n1==0){
                count++;
            }
        }
        return count;
    }
}