class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        //by frequency array
        int max_a=0;
        int max_t=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max_a){
                max_a=arr[i];
            }
            if(target[i]>max_t){
                max_t=target[i];
            }
        }
        if(max_a!=max_t){
            return false;
        }
        int nums[]=new int[max_a+1];
        for(int i=0;i<n;i++){
            nums[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(nums[target[i]]>0){
                nums[target[i]]--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}