class Solution {
    public static int search(int ar[],int target){
        int i=0;
        int j=ar.length-1;
        while(i<=j){
            if(ar[i]==target){
                return 1;
            }
            i++;
        }
        return -1;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<l1;i++){
                int f=search(nums2,nums1[i]);
                if(f==1){
                    set.add(nums1[i]);
                }
            }
        int l=set.size();
        ArrayList<Integer> list=new ArrayList<>(set);
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}