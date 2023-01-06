class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // n^2 approch TLE i know
        // int max=0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=i;j<nums2.length;j++){
        //         if(nums1[i]>nums2[j]){
        //             break;
        //         }
        //         else{
        //             max=Math.max((j-i),max);
        //         }
        //     }
        // }
        // return max;
        
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int j=i,k=nums2.length-1;
            int mid=0;
            while(j<=k){
                mid=k-(k-j)/2;
                if(nums1[i]<=nums2[mid]) j=mid+1;
                else k=mid-1;
            }
            // System.out.println(nums2[j-1]+" "+k);
            max=Math.max((j-i-1),max);
        }
        return max;
    }
}