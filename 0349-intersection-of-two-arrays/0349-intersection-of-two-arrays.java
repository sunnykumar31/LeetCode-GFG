class Solution{ 
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<l1;i++){
                set.add(nums1[i]);
            }
        int l=set.size();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<l2;i++){
            if(set.size()!=0 && set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
            if(set.size()==0){
                break;
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}