class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[]=new boolean[1000001];
        primeSeive(prime);
        int min=Integer.MAX_VALUE;
        int n1=0;
        int n2=0;
        int i=left;
        int ans[]=new int[2];
        while(i<=right){
            if(prime[i]==false){
                n1=i;
                i++;
                break;
            }
            i++;
        }
        while(i<=right){
            if(prime[i]==false){
                n2=i;
                if(n2-n1<min){
                    min=n2-n1;
                    ans[0]=n1;
                    ans[1]=n2;
                }
                n1=n2;
            }
            i++;
        }
        if(ans[0]==0 && ans[1]==0){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
    public static void primeSeive(boolean ar[]){
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i<ar.length;i++){
            if(ar[i]==false){
                for(int j=2;j*i<ar.length;j++){
                    ar[i*j]=true;
                }
            }
        }
        return;
    }
}