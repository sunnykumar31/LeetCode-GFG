class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int l1=s.length();
        int l2=p.length();
        char[] ch1=p.toCharArray();
        Arrays.sort(ch1);
        int i=0;
        while(i+l2<=l1){
            if(permutaion(s.substring(i,i+l2),ch1)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
    public static boolean permutaion(String s2,char ch1[]){
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