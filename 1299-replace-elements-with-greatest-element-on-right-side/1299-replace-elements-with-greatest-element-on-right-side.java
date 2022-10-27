class Solution {
    public int[] replaceElements(int[] arr) {
        //O(n^2);
        
        // for(int i=1;i<arr.length;i++){
        //     int max=arr[i];
        //     int index=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(max<arr[j]){
        //             max=arr[j];
        //         }
        //     }
        //     arr[i-1]=max;
        // }
        // arr[arr.length-1]=-1;
        // return arr;
        
        //O(n)
        
        int[] result = new int[arr.length];
        int curMax = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            result[i] = curMax;
            if(curMax < arr[i]) {
                curMax = arr[i];
            }
        }
        
        return result;

    }
}