class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            int l=0;
            int r=m;
            while(l<r){
                int mid=(l+r)/2;
                if(mat[i][mid]==1){
                    l=mid+1;
                }
                else{
                    r=mid;
                }
            }
            ar[i]=l;
        }
        int w_to_s[]=new int[k];
        int index=-1;
        for(int j=0;j<k;j++){
            // System.out.println(ar[j]);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(min>ar[i]){
                    index=i;
                    min=ar[i];
                }
            }
            w_to_s[j]=index;
            ar[index]=Integer.MAX_VALUE;
        }
        return w_to_s;
    }
}