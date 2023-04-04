class Solution {
    public int partitionString(String s) {
        //***********1st approch 39ms********
        
        // int count=1;
        // HashSet<Character> set=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     // if(!set.contains(s.charAt(i))){
        //     //     set.add(s.charAt(i));
        //     // }
        //     // else{
        //     //     count++;
        //     //     set=new HashSet<>();
        //     //     set.add(s.charAt(i));
        //     // }
        //     if(set.contains(s.charAt(i))){
        //         count++;
        //         set=new HashSet<>();
        //     }
        //     set.add(s.charAt(i));
        // }
        // return count;
        
        //******2nd approch by constant*****
        int count=1;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']>0){
                count++;
                Arrays.fill(freq,0);
            }
            freq[s.charAt(i)-'a']++;
        }
        return count;
    }
}
