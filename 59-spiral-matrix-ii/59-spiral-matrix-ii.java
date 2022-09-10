class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int minR=0;
        int minC=0;
        int maxR=n-1;
        int count=1;
        int maxC=n-1;
        while(count<=n*n){
            for(int i=minC;i<=maxC;i++){
                matrix[minR][i]=count;
                count++;
            }
            minR++;
            for(int i=minR;i<=maxR;i++){
                matrix[i][maxC]=count;
                count++;
            }
            maxC--;
            if(count==n*n+1) break;
            for(int i=maxC;i>=minC;i--){
                matrix[maxR][i]=count;
                count++;
            }
            maxR--;
            if(count==n*n+1) break;
            for(int i=maxR;i>=minR;i--){
                matrix[i][minC]=count;
                count++;
            }
            minC++;
        }
        return matrix;
        
    }
}