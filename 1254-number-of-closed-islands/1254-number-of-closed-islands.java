class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i*j==0 || i==n-1 || j==m-1 && grid[i][j]==0){
                    DFS(i,j,grid,n,m);
                }
            }
        }
        int count=0;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==0){
                    DFS(i,j,grid,n,m);
                    count++;
                }
            }
        }
        return count;
    }
    public static void DFS(int i,int j,int[][] grid,int n,int m){
        if(i>=n || j>=m || i<0 || j<0 || grid[i][j]!=0){
            return;
        }
        grid[i][j]=1;
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            DFS(x,y,grid,n,m);
        }
    }
}