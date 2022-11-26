class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=(int)Math.max(rec1[0],rec2[0]);
        int y1=(int)Math.max(rec1[1],rec2[1]);
         int x2=(int)Math.min(rec1[2],rec2[2]);
        int y2=(int)Math.min(rec1[3],rec2[3]);
        if((x2-x1)<=0 || (y2-y1)<=0){//means both rectangle don't intersects
            return false;
        }
        return true;
        // return 
        //     rec1[0] < rec2[2] &&
        //     rec1[1] < rec2[3] &&
        //     rec1[2] > rec2[0] &&
        //     rec1[3] > rec2[1]
        // ;
    }
}