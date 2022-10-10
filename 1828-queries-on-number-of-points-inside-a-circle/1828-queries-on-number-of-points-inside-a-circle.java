class Solution {
    public static int check_inside(int center_x,int center_y,int radius,int points_x,int points_y){
        int dif_x=center_x-points_x;
        int dif_y=center_y-points_y;
        dif_x*=dif_x;
        dif_y*=dif_y;
        int s=dif_x+dif_y;
        double distance=Math.sqrt(s);
        if(radius<distance){
            return 0;
        }
        return 1;
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int count[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<points.length;j++){
                int center_x=queries[i][0];
                int center_y=queries[i][1];
                int radius=queries[i][2];
                int points_x=points[j][0];
                int points_y=points[j][1];
                if(check_inside(center_x,center_y,radius,points_x,points_y)==1){
                    count[i]=count[i]+1;
                }
            }
        }
        return count;
    }
}