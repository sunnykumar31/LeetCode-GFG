class Solution {
    public static int find(int x1,int y1,int x2,int y2){
        int a=Math.abs(x1-x2);
        int b=Math.abs(y1-y2);
        return a*b;
    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x1=(int)Math.max(ax1,bx1);
        int x2=(int)Math.min(ax2,bx2);
        int y1=(int)Math.max(ay1,by1);
        int y2=(int)Math.min(ay2,by2);
        int area1=find(ax1,ay1,ax2,ay2);
        int area2=find(bx1,by1,bx2,by2);
        int union_area=find(x1,y1,x2,y2);
        if((x2-x1)<0 || (y2-y1)<0){//means both rectangle don't intersects
            union_area=0;
        }
        return area1+area2-union_area;
    }
}