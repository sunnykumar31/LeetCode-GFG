class Solution {
    public int findKthPositive(int[] arr, int k) {
        // if(arr.length==arr[arr.length-1]){
        //     return arr[arr.length-1]+k;
        // }
        int i=0;
        int j=arr.length;
        int mid=0;
        while(i<j){
            mid=(i+j)/2;
            if(arr[mid]-mid-1<k){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i+k;
    }
}