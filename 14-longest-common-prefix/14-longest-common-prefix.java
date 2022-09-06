class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                index=i;
            }
            if(strs[i].equals("")){
                return "";
            }
            if(strs[0].charAt(0)!=strs[i].charAt(0)){
                return "";
            }
        }
        
//         for(int i=0;i<strs.length;i++){
//             String str1=strs[index].substring(0,min);
//             // System.out.println(str1);
//             String str2=strs[i].substring(0,min);
//             System.out.println(str2);
//             if(str1.equals(str2)){
//                 if(i==strs.length-1){
//                     return str1;
//                 }
//             }
//             else if(min==0){
//                 break;
//             }
//             else{
//                 min--;
//                 // System.out.println(min+" "+index);
//                 i=0;
//             }
//         }
//         return "";
        
        StringBuilder st=new StringBuilder();
        for(int i=0;i<min;i++){
            int f=1;
            char c=strs[index].charAt(i);
            for(int j=0;j<strs.length;j++){
                char c1=strs[j].charAt(i);
                if(c1==c){
                    f++;
                }
                else{
                    break;
                }
            }
            if(f==strs.length+1){
                st.append(c);
            }
            if(st.length()!=i+1){
                break;
            }
        }
        String s=st.toString();
        return s;
    }
}