class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(search(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    static boolean f=false;
    public static boolean search(char[][] board, String word,int cr,int cc,int j){
        if(j==word.length()) return true;
        if(cr<0 || cc<0 || cr>=board.length || cc>=board[0].length ||  board[cr][cc]!=word.charAt(j)) return false;
        board[cr][cc]='0';
        int dx[]={1,-1,0,0};
        int dy[]={0,0,1,-1};
        for(int i=0;i<4;i++){
            int x=cr+dx[i];
            int y=cc+dy[i];
            boolean ans=search(board,word,x,y,j+1);
            if(ans) return ans;
        }
        board[cr][cc]=word.charAt(j);
        return false;
    }
}