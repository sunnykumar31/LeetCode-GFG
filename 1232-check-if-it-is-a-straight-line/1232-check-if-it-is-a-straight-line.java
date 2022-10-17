class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x=coordinates[1][0]-coordinates[0][0];
        int y=coordinates[1][1]-coordinates[0][1];
        float m=(float)x/y;
        // System.out.println(m);
        int f=0;
        for(int i=2;i<coordinates.length;i++){
            int p=coordinates[i][0]-coordinates[i-1][0];
            int q=coordinates[i][1]-coordinates[i-1][1];
            float m1=(float)p/q;
            if(y==0 && q==0){
                
            }
            else if(m1==m){
                
            }
            else{
                f=1;
                break;
            }
        }
        if(f==0){
            return true;
        }
        return false;
    }
}