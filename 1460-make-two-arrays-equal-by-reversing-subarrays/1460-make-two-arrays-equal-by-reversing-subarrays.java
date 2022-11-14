class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        //by frequency array
        // int max_a=0;
        // int max_t=0;
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max_a){
        //         max_a=arr[i];
        //     }
        //     if(target[i]>max_t){
        //         max_t=target[i];
        //     }
        // }
        // if(max_a!=max_t){ //if maximum value is not same than some value is not present so return false.
        //     return false;
        // }
        // int nums[]=new int[max_a+1];//making frequency array of arr updating by increasing the element at that index
        // for(int i=0;i<n;i++){
        //     nums[arr[i]]++;
        // }
        // for(int i=0;i<n;i++){
        //     if(nums[target[i]]>0){ //if target array present than must be greater than zero 
        //         nums[target[i]]--;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;
        
        //other way by frequency array
        int freq1[] = new int[1001];
        int freq2[] = new int[1001];
        for(int i=0;i<target.length;i++)
            freq1[target[i]]++;
        for(int i=0;i<arr.length;i++)
            freq2[arr[i]]++;
        for(int i=1;i<=1000;i++)
            if(freq1[i]!=freq2[i])
                return false;
        return true;
    }
}