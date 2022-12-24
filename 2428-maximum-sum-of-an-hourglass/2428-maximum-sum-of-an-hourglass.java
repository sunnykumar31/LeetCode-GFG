class Solution {
    public int maxSum(int[][] grid) {
        //Brute force
        int max=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                long sum=0;
                for(int k=i;k<3+i;k++){
                    for(int l=j;l<3+j;l++){
                        sum+=grid[k][l];
                    }
                }
                sum-=(grid[i+1][j]+grid[i+1][j+2]);
                if(max<sum){
                    max=(int)sum;
                }
            }
        }
        return max;
    }
}