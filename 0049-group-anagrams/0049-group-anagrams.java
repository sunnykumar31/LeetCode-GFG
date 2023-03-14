class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Brute Force  approch
//         List<List<String>> ans=new ArrayList<>();
//         for(int i=0;i<strs.length;i++){
//             if(!strs[i].equals("0")){
//                 int frq[]=new int[26];
//                 countfrq(frq,strs[i]);
//                 List<String> list=new ArrayList<>();
//                 list.add(strs[i]);
//                 for(int j=i+1;j<strs.length;j++){
//                     if(!strs[j].equals("0") && strs[i].length()==strs[j].length()){
//                         int frq2[]=new int[26];
//                         countfrq(frq2,strs[j]);
//                         if(check(frq,frq2)){
//                             list.add(strs[j]);
//                             strs[j]="0";
//                         }
//                     }

//                 }
//                 ans.add(list);
//             }
//         }
//         return ans;
//     }
//     public static void countfrq(int ar[],String s){
//         for(int i=0;i<s.length();i++){
//             ar[s.charAt(i)-'a']++;
//         }
//     }
//     public static boolean check(int ar1[],int ar2[]){
//         for(int i=0;i<26;i++){
//             if(ar1[i]!=ar2[i]) return false;
//         }
//         return true;
        
        
        //By using Map
        
        HashMap<String,List<String>> hp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String gs=generateBinary(strs[i]);
            if(!hp.containsKey(gs)){
                hp.put(gs,new ArrayList<>()); 
            }
            hp.get(gs).add(strs[i]);
        }
        List<List<String>> res=new ArrayList<>();
        for(String ans:hp.keySet()){
            res.add(hp.get(ans));
        }
        return res;
    }
    public static String generateBinary(String str){
            int f[]=new int[26];
            for(int i=0;i<str.length();i++){
                f[str.charAt(i)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(f[i]+" ");
            }
            return sb.toString();
        }
}