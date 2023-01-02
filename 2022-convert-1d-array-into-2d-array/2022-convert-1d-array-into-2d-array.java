class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(n*m!=original.length){
            return new int[0][0];
        }
        int ar[][]=new int[m][n];
        for(int i=0;i<original.length;i++){
            ar[i/n][i%n] = original[i];
        }
        return ar;
    }
}