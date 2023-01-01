class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x=coordinates[1][0]-coordinates[0][0];
        int y=coordinates[1][1]-coordinates[0][1];
        float m=(float)y/x;
        for(int i=2;i<coordinates.length;i++){
            int p=coordinates[i][0]-coordinates[i-1][0];
            int q=coordinates[i][1]-coordinates[i-1][1];
            float m1=(float)q/p;
            if(x==0 && p==0){}
            else if(m1==m){}
            else{
                return false;
            }
        }
        // System.out.println(2.0/0);
        return true;
        
        
    }
}