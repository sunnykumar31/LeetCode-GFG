class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int count=DFS(i,j,grid,n,m);
                    // System.out.println(count);
                    ans=Math.max(ans,count);
                }
            }
        }
        return ans;
    }
    public static int DFS(int i,int j,int[][] grid,int n,int m){
        if(i<n && j<m && i>=0 && j>=0 && grid[i][j]==1){
            grid[i][j]=0;
            // int dx[]={0,0,1,-1};
            // int dy[]={1,-1,0,0};
            // for(int k=0;k<4;k++){
            //     int x=i+dx[k];
            //     int y=j+dy[k];
            //     return 1+DFS(x,y,grid,n,m);
            // }
            return 1+DFS(i+1,j,grid,n,m)+DFS(i-1,j,grid,n,m)+DFS(i,j+1,grid,n,m)+DFS(i,j-1,grid,n,m);
        }
        return 0;
    }
}