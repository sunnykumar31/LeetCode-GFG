class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ar[]=new int[m+n];
        int i=0;
        int j=0;
        int index=0;
        while(m>j && n>i){
            if(nums1[j]<=nums2[i]){
                ar[index]=nums1[j];
                j++;
                index++;
            }
            else{
                ar[index]=nums2[i];
                i++;
                index++;
            }
        }
        if(n==i){
            while(m>j){
                ar[index]=nums1[j];
                j++;
                index++;
            }
        }
        else if(m==j){
            while(n>i){
                ar[index]=nums2[i];
                i++;
                index++;
            }
        }
        for(int k=0;k<index;k++){
            nums1[k]=ar[k];
        }
        return;
    }
}