class Solution {
   public static int[] search(int ar[],int target){
        int index[]=new int[2];
        int i=0;
        int j=ar.length-1;
        while(i<=j){
            if(ar[i]==target){
                index[0]=1;
                index[1]=i;
                return index;
            }
            i++;
        }
        return index;
    }
     public int[] intersect(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        ArrayList<Integer> list=new ArrayList<>();
        if(l1<l2){
            for(int i=0;i<l1;i++){
                int index[]=search(nums2,nums1[i]);
                if(index[0]==1){
                    list.add(nums1[i]);
                    nums1[i]=-1;
                    nums2[index[1]]=-1;
                }
            }
        }
         else{
             for(int i=0;i<l2;i++){
                int index[]=search(nums1,nums2[i]);
                if(index[0]==1){
                    list.add(nums2[i]);
                    nums2[i]=-1;
                    nums1[index[1]]=-1;
                }
            }
         }
        int l=list.size();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=list.get(i);
        }
        return arr;
     }
}