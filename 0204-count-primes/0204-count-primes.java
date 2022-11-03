class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean ar[]=new boolean[n];
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i<ar.length;i++){
            if(ar[i]==false){
                for(int j=2;i*j<=n-1;j++){
                    ar[i*j]=true;
                }
            }
        }
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==false){
                count++;
            }
        }
        return count;
    }
}