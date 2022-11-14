class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int ar[]=new int[n];
        int i=0;
        int k=0;
        int j=n-1;
        while(i<n){
            if(nums[i]%2==0){
                ar[k]=nums[i];
                k++;
            }
            else{
                ar[j]=nums[i];
                j--;
            }
            i++;
        }
        return ar;
    }
}