class Solution {
    public int minDeletions(String s) {
        //ek frequency array bnaya uske baad usko sort kr diya then piche se check krte chale agr dono equal(0,0,4,4) hai to count ko ek se increase kr do qki hame bs ek hi km krna hai chahiye frequency(0,0,3,4) unequal krne k liye agr frequency ek do operation k baad bara ho gya apne aage wale se(0,0,4,2,3,5) to chote wale se ek km kr k copy kr de piche wale m (0,0,1,2,3,5) agr piche wale zero ho gya to(0,0,2,0,1,2,5) to (0,0,0,0,1,2,5) aisa krna padega count ko bhi increase kr do as per requirement
        int ar[]=new int[26];
        for(int i=0;i<s.length();i++){
            int j=(int)(s.charAt(i)-97);
            ar[j]++;
        }
        Arrays.sort(ar);
        int count=0;
        for(int i=25;i>0;i--){
            if(ar[i]==0 && ar[i-1]==0){
                break;
            }
            else if(ar[i]==ar[i-1]){
                count++;
                ar[i-1]--;
            }
            else if(ar[i-1]>0 && ar[i]==0){
                count+=ar[i-1];
                ar[i-1]=0;
            }
            else if(ar[i]<ar[i-1]){
                int temp=ar[i-1];
                ar[i-1]=ar[i]-1;;
                count+=temp-ar[i-1];
                
            }
        }
        return count;
    }
}