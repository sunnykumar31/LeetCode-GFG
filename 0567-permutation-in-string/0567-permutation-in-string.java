class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
        int i=0;
        while(i+l1<=l2){
            if(permutaion(ch1,s2.substring(i,i+l1))){
                return true;
            }
            i++;
        }
        return false;
    }
    public static boolean permutaion(char ch1[],String s2){
        // System.out.println(s1+" "+s2);
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
            
        }
        return true;
        
    }
    
}