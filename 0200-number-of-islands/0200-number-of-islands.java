class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    DFS(i,j,grid,n,m);
                    count++;
                }
            }
        }
        return count;
    }
    public static void DFS(int i,int j,char[][] grid,int n,int m){
        if(i<0 || i>=n || j<0 ||j>=m || grid[i][j]=='0') return;
        grid[i][j]='0';
        int dx[]={1,-1,0,0};
        int dy[]={0,0,1,-1};
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            DFS(x,y,grid,n,m);
        }
    }
}