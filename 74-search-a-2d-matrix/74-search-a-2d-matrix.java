class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowlen=matrix.length;
        int collen=matrix[0].length;
        int index=0;
        for(int i=0;i<rowlen;i++){
            if(matrix[i][collen-1]==target){
                return true;
            }
            else if(matrix[i][collen-1]>target){
                index=i; 
                break;
            }
        }
        int i=0;
        int j=matrix[0].length-1;
        while(i<=j){
            int mid=j-(j-i)/2;
            if(matrix[index][mid]==target){
                return true;
            }
            else if(matrix[index][mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
        // for(int j=0;j<collen;j++){
        //     if(matrix[index][j]==target){
        //         return true;
        //     }
        // }
        // return false;
    }
}