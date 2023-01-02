class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int ar[]=new int[m*n];
        int i=0;
        for(int j=0;j<m;j++){
            for(int k=0;k<n;k++){
                ar[i]=mat[j][k];
                i++;
            }
        }
        i=0;
        int reshape[][]=new int[r][c];
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){
                reshape[j][k]=ar[i];
                i++;
            }
        }
        return reshape;
    }
}