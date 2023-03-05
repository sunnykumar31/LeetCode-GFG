class Solution {
    public int reinitializePermutation(int n) {
        int perm[]=new int[n];
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            perm[i]=i;
            // ar[i]=i;
        }
        int f=0;
        int count=0;
        while(f!=1){
            count++;
            for(int j=0;j<n;j++){
                if((j&1)==0){
                    ar[j]=perm[j/2];
                }
                else{
                    ar[j]=perm[(n/2)+((j-1)/2)];
                }
            }
            for(int j=0;j<n;j++){
                perm[j]=ar[j];
                // System.out.print(perm[j]+" ");
            }
            // System.out.println();
            for(int j=0;j<n;j++){
                f=1;
                if(perm[j]!=j){
                    f=0;
                    break;
                }
            }
        }
        return count;
    }
}