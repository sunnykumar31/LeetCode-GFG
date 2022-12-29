class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //this solution in O(n);
        // int max=Integer.MIN_VALUE;
        // int index=-1;
        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         max=arr[i];
        //         index=i;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return index;
        
        //O(logn) solution
        
        int i=0;
        int j=arr.length-1;
        int mid=i+(j-i)/2;
        while(i<j){
            if(arr[mid]<arr[mid+1]){
                i=mid+1;
            }
            else{
                j=mid;
            }
            mid=i+(j-i)/2;
        }
        return mid;
    }
}