class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(!strs[i].equals("0")){
                int frq[]=new int[26];
                countfrq(frq,strs[i]);
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(!strs[j].equals("0") && strs[i].length()==strs[j].length()){
                        int frq2[]=new int[26];
                        countfrq(frq2,strs[j]);
                        if(check(frq,frq2)){
                            list.add(strs[j]);
                            strs[j]="0";
                        }
                    }

                }
                ans.add(list);
            }
        }
        return ans;
    }
    public static void countfrq(int ar[],String s){
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
        }
    }
    public static boolean check(int ar1[],int ar2[]){
        for(int i=0;i<26;i++){
            if(ar1[i]!=ar2[i]) return false;
        }
        return true;
    }
}