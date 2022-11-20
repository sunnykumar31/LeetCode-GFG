class Solution {
    public String frequencySort(String s) {
        int ar[]=new int[62];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=0;
            if(c>='A' && c<='Z'){
                n=c-65+10;
                
            }
            else if(c>='0' && c<='9'){
                n=c-48;
            }
            else{
                n=c-97+36;
            }
            ar[n]=ar[n]+1;
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<62;i++){
            int max=0;
            int index=0;
            for(int j=0;j<62;j++){
                if(ar[j]>max){
                    max=ar[j];
                    index=j;
                }
            }
            // System.out.println(max+" "+index);
            if(index<10){
                for(int j=1;j<=max;j++){
                int ascii=index+48;
                char c1=(char)ascii;
                sb.append(c1);
                }
                ar[index]=0;
            }
            else if(index<36){
                for(int j=1;j<=max;j++){
                    int ascii=index+65-10;
                    char c1=(char)ascii;
                    sb.append(c1);
                }
                ar[index]=0;
            }
            else{
                for(int j=1;j<=max;j++){
                    int ascii=index+97-36;
                    char c1=(char)ascii;
                    sb.append(c1);
                }
                ar[index]=0;
            }
            
        }
        s=sb.toString();
        return s;
    }
}