class Solution {
    public int minPairSum(int[] nums) {
        // by the sorting method it is easy
        // Arrays.sort(nums);
        // int i=0;
        // int j=nums.length-1;
        // int sum1=0;
        // int max=0;
        // while(i<j){
        //     sum1=nums[i]+nums[j];
        //     if(sum1>max){
        //         max=sum1;
        //     }
        //     i++;
        //     j--;
        // }
        // return max;
        
        //by frequency method
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int ar[]=new int[max+1]; //we ar going to use index as element in sorted form 
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;
        }
        int i=0;
        int j=ar.length-1;
        int fmax=0;
        while(i<=j){
            if(ar[i]==0){
                i++;
                continue;
            }
            if(ar[j]==0){
                j--;
                continue;
            }
            if(ar[i]!=0 && ar[j]!=0){
                if(i+j>fmax){
                    fmax=i+j;
                }
                ar[i]--;
                ar[j]--;
            }
        }
        return fmax;
    }
}