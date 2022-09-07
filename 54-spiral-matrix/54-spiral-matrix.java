class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int minR=0;
        int minC=0;
        int maxR=matrix.length-1;
        int count=0;
        int maxC=matrix[0].length-1;
        while(count<matrix.length*matrix[0].length){
            for(int i=minC;i<=maxC;i++){
                list.add(matrix[minR][i]);
                count++;
            }
            minR++;
            for(int i=minR;i<=maxR;i++){
                list.add(matrix[i][maxC]);
                count++;
            }
            maxC--;
            if(count==matrix.length*matrix[0].length) break;
            for(int i=maxC;i>=minC;i--){
                list.add(matrix[maxR][i]);
                count++;
            }
            maxR--;
            if(count==matrix.length*matrix[0].length) break;
            for(int i=maxR;i>=minR;i--){
                list.add(matrix[i][minC]);
                count++;
            }
            minC++;
        }
        return list;
        
    }
}