class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //jada optimize approch nhi hai bt approch hai
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c || (m==r && n==c)){
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
        
        // 2nd approch after submission and taken from submission
        // int row = mat.length;
        // int col = mat[0].length;
        // if(row*col!=r*c)
        // {
        //     return mat;
        // }
        // if(row==r && col==c)
        // {
        //     return mat;
        // }
        // int n = 0;
        // int m = 0;
        // int new_mat[][] = new int[r][c];
        // while(n<r*c && m<row*col)
        // {
        //     new_mat[n/c][n%c] = mat[m/col][m%col];
        //     n++;
        //     m++;
        // }
        // return new_mat;
    }
}