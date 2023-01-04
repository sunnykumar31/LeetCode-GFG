class Solution {
    public int[] kWeakestRows(int[][] mat, int p) {
        int n=mat.length;
        int m=mat[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
             int j=0;
            int k=m-1;
            while(j<=k){
                int mid=(j+k)/2;
                if(mat[i][mid]==1){
                    j=mid+1;
                }
                else if(mat[i][mid]==0){
                    k=mid-1;
                }
            }
            pq.add(j*1000+i);
        }
        int w_to_s[]=new int[p];
        for(int i=0;i<p;i++){
            w_to_s[i]=pq.poll()%1000;
        }
        return w_to_s;
    }
}