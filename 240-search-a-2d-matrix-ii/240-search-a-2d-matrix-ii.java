class Solution {
    public static int binarysearch(int ar[],int target){
        
        int i=0;
        int j=ar.length-1;
        while(i<=j){
            int mid=mid=i+(j-i)/2;
            if(ar[mid]==target){
                return 1;
            }
            else if(target>ar[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return 0;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int f=binarysearch(matrix[i],target);
            if(f==1){
                return true;
            }
        }
        return false;
    }
}