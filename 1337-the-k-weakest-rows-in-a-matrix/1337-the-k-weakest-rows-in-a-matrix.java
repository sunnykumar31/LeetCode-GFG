class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    sum++;
                }
                else{
                    break;
                }
            }
            ar[i]=sum*1000+i;
        }
        Arrays.sort(ar);
        int w_to_s[]=new int[k];
        for(int i=0;i<k;i++){
            w_to_s[i]=ar[i]%1000;
        }
        return w_to_s;
    }
}