class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=n;
        int k=0;
        int ar[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            ar[i]=nums[k];
            i++;
            ar[i]=nums[j];
            k++;
            j++;
        }
        return ar;
    }
}