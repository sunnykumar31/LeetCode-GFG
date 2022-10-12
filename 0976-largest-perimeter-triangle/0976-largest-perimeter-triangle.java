class Solution {
    public int validtriangle(int a,int b,int c){
        if(a+b>c && a+c>b && b+c>a){
            return a+b+c;
        }
        else{
            return -1;
        }
    }
    public int largestPerimeter(int[] nums) {
        // for(int j=0;j<3;j++){
        //     int max=j;
        //     for(int i=j+1;i<nums.length;i++){
        //         if(nums[i]>nums[max]){
        //             max=i;
        //         }
        //     }
        //     int temp=nums[j];
        //     nums[j]=nums[max];
        //     nums[max]=temp;
        // }
        // if(nums[0]<nums[1]+nums[2] && nums[1]<nums[0]+nums[2] && nums[2]<nums[0]+nums[1]){
        //     return nums[0]+nums[1]+nums[2];
        // }
        // return 0;
        
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=l-1;i>=2;i--){
            int val=validtriangle(nums[i],nums[i-1],nums[i-2]);
            if(val>0){
                return val;
            }
                
        }
        return 0;
        
    }
}