class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         list.add(matrix[i][j]);
        //     }
        // }
        // Collections.sort(list);
        // return list.get(k-1);
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
    }
}