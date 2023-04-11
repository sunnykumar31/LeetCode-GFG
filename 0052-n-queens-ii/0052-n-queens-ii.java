class Solution {
    public int totalNQueens(int n) {
        boolean b[][]=new boolean[n][n];
        path(b,0,n);
        return count;
    }
    public int count=0;
    public void path(boolean b[][],int row,int q){
        if(q==0){
            count++;
            return;
        }
        if(row>=b.length) return;
        for(int col=0;col<b[0].length;col++){
            if(itPossible(b,row,col)==true){
                b[row][col]=true;
                path(b,row+1,q-1);
                b[row][col]=false;
            }
        }
    }
    public static boolean itPossible(boolean b[][],int row,int col){
        int r=row;
        //upper side
        while(r>=0){
            if(b[r][col]==true){
                return false;
            }
            r--;
        }
        r=row;
        int c=col;
        //left diagonal side
        while(r>=0 && c>=0){
            if(b[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        //right side diagonal
        while(r>=0 && c<b[0].length){
            if(b[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}