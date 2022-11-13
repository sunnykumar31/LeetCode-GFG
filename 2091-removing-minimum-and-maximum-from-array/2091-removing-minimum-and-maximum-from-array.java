class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int n=nums.length;
        //finding max and min element index;
        for(int k=0;k<n;k++){
            if(nums[k]>max){
                max=nums[k];
                j=k;
            }
            if(nums[k]<min){
                min=nums[k];
                i=k;
            }
        }
        if(j>=i){ //if max index element is greater than smaller index element then 
            int p=n-j+i+1;// deleting elemnet from last and first ex [2,10,7,5,4,1,8,6]
            int q=n-i;    // deleting element from last ex [2,8,7,5,4,1,10,6]
            return Math.min(Math.min(p,q),j+1); //for j+1  ex [-1,-53,93,-42,37,94,-97,82,46,42,99,56,-76,-66,-67,-13,10,66,85,-28]

        }
        else{ 
            int p=n-i+j+1;
             int q=n-j;
            return Math.min(Math.min(p,q),i+1);
        }
    }
}