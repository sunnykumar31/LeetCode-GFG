class Solution {
    public static void divide(int ar[],int s,int l){
        if(s>=l){
            return;
        }
        int mid=(l+s)/2;
        divide(ar,s,mid);
        divide(ar,mid+1,l);
        conquer(ar,s,mid,l);
    }
    public static void conquer(int ar[],int s,int mid,int l){
        int merge[]=new int[l-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=l){
            if(ar[idx1]<=ar[idx2]){
                merge[x++]=ar[idx1++];
            }
            else{
                merge[x++]=ar[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++]=ar[idx1++];
        }
        while(idx2<=l){
            merge[x++]=ar[idx2++];
        }
        int j=s;
        for(int i=0;i<merge.length;i++){
            ar[j++]=merge[i];
        }
    }
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
}