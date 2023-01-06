class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int l=nums.lengthl
        int arr[]=new int[2];
        if(nums.length==0){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        if(nums.length==1 && target==nums[0]){
            arr[0]=0;
            arr[1]=0;
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                arr[0]=i;
                break;
            }
            else{
                arr[0]=-1;
            }
        }
        if(arr[0]!=-1){
            int j;
            for(j=arr[0]+1;j<nums.length;j++){
                if(target!=nums[j]){
                    arr[1]=j-1;
                    return arr;
                }
            }
            if(target==nums[j-1]){
                arr[1]=j-1;
                return arr;
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
}