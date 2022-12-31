class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minindex=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            if(x==x1 || y==y1){
                int val=Math.abs(x-x1) + Math.abs(y-y1);
                if(val<=min){
                    if(val!=min){
                        minindex=i;
                    }
                    min=val;
                }
            }
        }
        if(minindex!=-1){
            return minindex;
        }
        return -1;
        
    }
}