class Solution {
    public int countNegatives(int[][] grid) {
        //m*log(n)
        int count=0;
        for(int i=0;i<grid.length;i++){
            int j=0;
            int k=grid[0].length-1;
            int mid=0;
            while(j<=k){
                mid=(j+k)/2;
                if(grid[i][mid]>=0){
                    j=mid+1;
                }
                else{
                    k=mid-1;
                }
            }
            // System.out.println(mid);
            count+=grid[0].length-1-k;
            // mat.length - hi - 1;

            
        }
        return count;
    }
}