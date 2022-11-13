class Solution {
    public int minDeletions(String s) {
        int ar[]=new int[26];
        for(int i=0;i<s.length();i++){
            int j=(int)(s.charAt(i)-97);
            ar[j]++;
        }
        Arrays.sort(ar);
        int count=0;
        for(int i=25;i>0;i--){
            // System.out.println(ar[i]);
            if(ar[i]==0 && ar[i-1]==0){
                break;
            }
            if(ar[i-1]>0 && ar[i]==0){
                count+=ar[i-1];
                ar[i-1]=0;
            }
            else if(ar[i]==ar[i-1]){
                count++;
                ar[i-1]--;
            }
            else if(ar[i]<ar[i-1]){
                int temp=ar[i-1];
                ar[i-1]=ar[i]-1;;
                count+=temp-ar[i-1];
                
            }
            // System.out.println(count);
        }
        return count;
    }
}