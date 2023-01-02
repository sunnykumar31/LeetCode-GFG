class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length-1;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i] +mat[i][n-i];
        }
        if(mat.length%2!=0){
            int k=n/2;
            sum-=mat[k][k];
        }
        return sum;
    }
}