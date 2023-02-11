class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    l.add(j);
                }
            }
            list.add(l);
        }
        for(int i=0;i<list.size();i++){
            // System.out.println(list.get(i));
            if(list.get(i).size()!=0){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }
            for(int j=0;j<list.get(i).size();j++){
                for(int k=0;k<m;k++){
                    matrix[k][list.get(i).get(j)]=0;
                }
            }
        }
        return;
    }
}