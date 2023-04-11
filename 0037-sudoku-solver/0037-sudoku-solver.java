class Solution {
    public void solveSudoku(char[][] board) {
        char[][] b=new char[9][9];
        solve(board,0,0,b);
         for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    board[i][j]=b[i][j];
                }
            }
        return;
    }
    public static void solve(char [][]board,int row,int col,char[][] b){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    // System.out.print(board[i][j]+" ");
                    b[i][j]=board[i][j];
                }
            }
            return;
        }
        if(board[row][col]!='.'){
            solve(board,row,col+1,b);
        }
        else{
            for(char val='1';val<='9';val++){
               if(itPossible(board,row,col,val)==val){
                   board[row][col]=val;
                   solve(board,row,col+1,b);
                   board[row][col]='.';
               }
            }
        }
    }
    public static char itPossible(char [][]board,int row,int col,char val){
            //  check in row
        int r=0;
        while(r<9){
            if(board[r][col]==val){
                return '.';
            }
            r++;
        }
        // check in col
        int c=0;
        while(c<9){
            if(board[row][c]==val){
                return '.';
            }
            c++;
        }
        // check in that 3*3 matrix
        r=3*(row/3);
        c=3*(col/3);
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==val){
                    return '.';
                }
            }
        }
        return val;
    }
}