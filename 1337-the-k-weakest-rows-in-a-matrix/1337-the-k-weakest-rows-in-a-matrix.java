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
            ar[i]=l*1000+i;
        }
        Arrays.sort(ar);
        int w_to_s[]=new int[k];
        for(int i=0;i<k;i++){
            w_to_s[i]=ar[i]%1000;
        }
        return w_to_s;
    }
}