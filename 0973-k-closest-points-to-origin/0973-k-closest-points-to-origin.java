class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int ar[]=new int[points.length];
        int close[][]=new int[k][2];
        for(int i=0;i<points.length;i++){
            // ar[i]=(int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2);
            ar[i]=points[i][0]*points[i][0] +points[i][1]*points[i][1];
        }
        // System.out.println(ar[0]+" "+ar[1]);
        for(int j=0;j<k;j++){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<points.length;i++){
                if(min>ar[i]){
                    min=ar[i];
                    index=i;
                }
            }
            close[j][0]=points[index][0];
            close[j][1]=points[index][1];
            ar[index]=Integer.MAX_VALUE;
        }
        return close;
    }
}