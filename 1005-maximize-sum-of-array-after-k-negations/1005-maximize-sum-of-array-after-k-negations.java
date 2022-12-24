class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // int min=Integer.MAX_VALUE;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     if(min>nums[i]){
        //         min=nums[i];
        //     }
        //     sum+=nums[i];
        // }
        // if(min>0){
        //     if(k%2==0){
        //         return sum;
        //     }
        //     else{
        //         sum-=(2*min);
        //         return sum;
        //     }
        // }
        // else{
        //     if(k%2==0){
        //         sum+=(2*min);
        //         return sum;
        //     }
        //     else{
        //         return sum;
        //     }
        // }
        
        Arrays.sort(nums); 
        int i=0;
        while(k!=0 && i<nums.length){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
            else{
                if(i==0 && k%2!=0){
                    nums[i]=-nums[i];
                }
                else{
                    if(nums[i]!=0 && k%2!=0){
                        if(nums[i]>nums[i-1]){
                            nums[i-1]=-nums[i-1];
                        }
                        else{
                            nums[i]=-nums[i];
                        }
                    }
                }
                k=0;
            }
            i++;
        }
        if(k%2!=0){
            nums[i-1]=-nums[i-1];
        }
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
        
    }
}