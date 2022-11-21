class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int c=1;
        int i=0;
        for(;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            else{
               if(c>n/3){
                    list.add(nums[i]);

                } 
                c=1;
            } 
        }
        if(c>n/3){
            list.add(nums[i]);

        } 
        return list;
    }
}