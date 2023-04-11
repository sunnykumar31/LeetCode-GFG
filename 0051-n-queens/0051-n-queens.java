class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char b[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]='.';
            }
        }
        path(b,res,0,n);
        return res;
    }
    public static void path(char b[][],List<List<String>> res,int row,int q){
        if(q==0){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<b.length;i++){
                ans.add(new String(b[i]));
            }
            res.add(ans);
            return;
        }
        if(row>=b.length) return;
        for(int col=0;col<b[0].length;col++){
            if(itPossible(b,row,col)=='Q'){
                b[row][col]='Q';
                path(b,res,row+1,q-1);
                b[row][col]='.';
            }
        }
    }
    public static char itPossible(char b[][],int row,int col){
        int r=row;
        //upper side
        while(r>=0){
            if(b[r][col]=='Q'){
                return '.';
            }
            r--;
        }
        r=row;
        int c=col;
        //left diagonal side
        while(r>=0 && c>=0){
            if(b[r][c]=='Q'){
                return '.';
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<b[0].length){
            if(b[r][c]=='Q'){
                return '.';
            }
            r--;
            c++;
        }
        return 'Q';
    }
}